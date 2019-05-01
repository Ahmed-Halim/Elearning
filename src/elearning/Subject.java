
package elearning;

import java.util.ArrayList;

public class Subject {
	
   ArrayList<Observer> observers = new ArrayList<Observer>();
   String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
        notifyAllObservers();
    }
   
   
   public void addObserver(Observer observer){
      observers.add(observer);		
   }
   
   public void removeObserver(Observer observer){
      observers.remove(observer);		
   }

   public void notifyAllObservers(){
      for (Observer observer : observers) {
         observer.update();
      }
   } 	
}