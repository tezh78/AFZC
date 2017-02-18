/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flashablezipcreator.Protocols;

import java.awt.Desktop;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Nikhil
 */
public class Update {

    public static String RawLatestBetaVersion = "https://raw.githubusercontent.com/nikhilmenghani/FlashableZipCreator/master/src/flashablezipcreator/Update/LatestBetaVersion";
    public static String RawLatestStableVersion = "https://raw.githubusercontent.com/nikhilmenghani/FlashableZipCreator/master/src/flashablezipcreator/Update/LatestStableVersion";
    public static String RawDownloadLatestBetaVersion = "https://raw.githubusercontent.com/nikhilmenghani/FlashableZipCreator/master/src/flashablezipcreator/Update/DownloadLatestBetaVersion";
    public static String RawDownloadLatestStableVersion = "https://raw.githubusercontent.com/nikhilmenghani/FlashableZipCreator/master/src/flashablezipcreator/Update/DownloadLatestStableVersion";
    public static String RawChangeLogBeta = "https://raw.githubusercontent.com/nikhilmenghani/FlashableZipCreator/master/src/flashablezipcreator/Update/ChangeLogBeta";
    public static String RawChangeLogStable = "https://raw.githubusercontent.com/nikhilmenghani/FlashableZipCreator/master/src/flashablezipcreator/Update/ChangeLogStable";
    public static String RawUpcomingFeatures = "https://raw.githubusercontent.com/nikhilmenghani/FlashableZipCreator/master/src/flashablezipcreator/Update/UpcomingFeatures";
    public static float CurrentVersion = 4.0F;
    public static String CurrentVersionType = "Beta";
    public static boolean isBetaUpdateAvailable = false;
    public static boolean isStableUpdateAvailable = false;
    public static String betaDownloadLink = "";
    public static String stableDownloadLink = "";

    public static void runUpdateCheck() {
        if (Update.netIsAvailable()) {
            if (Update.isStableUpdateAvailable()) {
                isStableUpdateAvailable = true;
            }
            if (Update.isBetaUpdateAvailable()) {
                isBetaUpdateAvailable = true;
            }
            Logs.write("Beta update status: " + Update.isBetaUpdateAvailable);
            Logs.write("Stable update status: " + Update.isStableUpdateAvailable);
        }
    }

    public static void downloadBetaVersion() throws URISyntaxException {
        String downloadLink = Update.getBetaDownloadLink();
        Update.openWebpage(new URI(downloadLink));
    }

    public static void downloadStableVersion() throws URISyntaxException {
        String downloadLink = Update.getStableDownloadLink();
        Update.openWebpage(new URI(downloadLink));
    }

    public static String getHtmlContent(String url) {
        String content = "";
        URLConnection connection = null;
        try {
            connection = new URL(url).openConnection();
            Scanner scanner = new Scanner(connection.getInputStream());
            scanner.useDelimiter("\\Z");
            content = scanner.next();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return content;
    }

    public static String getBetaVersion() {
        return getHtmlContent(RawLatestBetaVersion);
    }

    public static String getStableVersion() {
        return getHtmlContent(RawLatestStableVersion);
    }

    public static String getBetaDownloadLink() {
        return getHtmlContent(RawDownloadLatestBetaVersion);
    }

    public static String getStableDownloadLink() {
        return getHtmlContent(RawDownloadLatestStableVersion);
    }

    public static String getBetaChangelog() {
        return getHtmlContent(RawChangeLogBeta);
    }

    public static String getStableChangelog() {
        return getHtmlContent(RawChangeLogStable);
    }

    public static String getUpcomingFeatures() {
        return getHtmlContent(RawUpcomingFeatures);
    }

    public static boolean isBetaUpdateAvailable() {
        boolean updateStatus = false;
        float betaVersion = Float.valueOf(getBetaVersion());
        if (CurrentVersion < betaVersion) {
            updateStatus = true;
        }
        return updateStatus;
    }

    public static boolean isStableUpdateAvailable() {
        boolean updateStatus = false;
        float stableVersion = Float.valueOf(getStableVersion());
        if (CurrentVersion < stableVersion) {
            updateStatus = true;
        }
        return updateStatus;
    }

    public static void openURL(String url) throws InterruptedException {
        StringBuilder sb = new StringBuilder();
        if (System.getProperty("os.name").contains("Windows")) {
            String command = null;
            String urlLC = url.toLowerCase();
            if (urlLC.startsWith("https")) {
                command = WindowsCommandRetriever.getCommandForFileType("https");
            } else if (urlLC.startsWith("http")) {
                command = WindowsCommandRetriever.getCommandForFileType("http");
            }
            if (command == null) {
                command = WindowsCommandRetriever.commandForExtension(".html");
            }
            if (command.contains("%1")) {
                sb.append(command.substring(0, command.indexOf("%1")));
                sb.append(url);
                sb.append(command.substring(command.indexOf("%1") + "%1".length()));
            } else {
                sb.append(command).append(' ');
                sb.append('"');
                sb.append(url);
                sb.append('"');
            }
        } else {
            sb.append("open ");
            sb.append(url);
        }
        try {
            final Process p = Runtime.getRuntime().exec(sb.toString());

            // Here you have the process. You can destroy it if you want
            // You need to figure out how you are going to handle this here.
        } catch (IOException e1) {
            System.err.println("Error while executing " + sb.toString());
        }
    }

    public static void openWebpage(URI uri) {
        Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
        if (desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
            try {
                //openURL("https://www.google.co.in/?gws_rd=ssl");
                desktop.browse(uri);
            } catch (Exception e) {
                Logs.write("Exception Caught while opening url: " + Logs.getExceptionTrace(e));
                JOptionPane.showMessageDialog(null, "Exception Caught while opening url: " + Logs.getExceptionTrace(e));
            }
        }
    }

    public static void openWebpage(URL url) {
        try {
            openWebpage(url.toURI());
        } catch (URISyntaxException e) {
        }
    }

    public static boolean netIsAvailable() {
        try {
            final URL url = new URL("http://www.google.com");
            final URLConnection conn = url.openConnection();
            conn.connect();
            return true;
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            return false;
        }
    }
}
