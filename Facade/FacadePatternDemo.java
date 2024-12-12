public class FacadePatternDemo {
    public static void main(String[] args) {
        HomeAutomationFacade homeAutomation = new HomeAutomationFacade();

        homeAutomation.arriveHome();
        homeAutomation.setTemperature(22);
        homeAutomation.playMusic("Favorite Song");
        System.out.println(homeAutomation.checkSecurityStatus());
        homeAutomation.leaveHome();
    }
}