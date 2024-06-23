public class Race {
    private String leaderName = "";
    private int leaderDistance = 0;

    public void checkNewLeader(Car car) {
        int distance = car.getSpeed() * 24;
        if (distance > leaderDistance) {
            leaderDistance = distance;
            leaderName = car.getName();
        }
    }

    public String getLeader() {
        return leaderName;
    }
}