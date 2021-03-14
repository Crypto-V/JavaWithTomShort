package oop.practiceWithMosh.class1;

public class Browser {

    public void navidate(String address){
     String ip = findIpAddress(address);
     String html = sendHttpRequest(ip);
        System.out.println(html);
    }

    private String sendHttpRequest(String ip) {
        return "<html>something</html>";
    }

    private String findIpAddress(String address) {
        return "127.0.0.1";
    }
}
