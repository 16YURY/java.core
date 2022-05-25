public class Main {
     public static void main(String[] args) {


            Course course = new Course(new String[]{"woter", "way" });
            Team team = new Team(new String[]{"cat", "dog", "bird", "fish"});



            team.printAll();
            course.doIt(team);
            team.printAll();
        }

}
