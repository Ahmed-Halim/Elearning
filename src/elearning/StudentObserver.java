package elearning;

public class StudentObserver extends Observer {

   public StudentObserver(Subject subject){
      this.subject = subject;
      this.subject.addObserver(this);
   }

   @Override
   public void update() {
      System.out.println(subject.getMsg()); 
   }
}