public class Team {
    public final Member[] memebers;

    public Team(String[] memberName) {
        int idx = 0;
        this.memebers = new Member[memberName.length];
        for (String s : memberName) {
            this.memebers[idx++] = new Member(s, false);
        }
    }

    public void doIt() {
        for (Member m : this.memebers) {
            m.distance = true;
        }
    }

    public void print(Boolean all) {
        for (Member m: this.memebers) {
            if (all || m.distance) {
                System.out.println("Name " + m.name + ", distance " + m.distance);
            }
        }
    }

    public void printAll() {
        this.print(true);
    }

    public void printDistance() {
        this.print(false);
    }
}
