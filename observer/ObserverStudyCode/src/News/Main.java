package News;

public class Main {
    public static void main(String[] args) {
        NewsAgency agency = new NewsAgency();

        NewsChannel channel1 = new NewsChannel("Channel 1");
        NewsChannel channel2 = new NewsChannel("Channel 2");

        agency.registerObserver(channel1);
        agency.registerObserver(channel2);

        agency.setNews("Breaking news: 숭실대팟 드디어 공부하기 시작함!");

        agency.removeObserver(channel2);

        agency.setNews("Another update: Channel 2 구독 해제됨");
    }
}
