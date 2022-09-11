package hosts;

import broadcasts.Broadcast;

public class AbstractHost {
    private String name;
    private int workExperience;

    protected AbstractHost(String name, int workExperienceInMonth) {
        this.name = name;
        this.workExperience = workExperienceInMonth;
    }

    public void currentBroadcast(Broadcast broadcast) {
        System.out.println("Currently playing " + broadcast.getStreams().peek());
    }

    public String getName() {
        return name;
    }

    public int getWorkExperience() {
        return workExperience;
    }
}
