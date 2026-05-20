
interface Walkable {
    public void walk();
}
class NormalWalk implements Walkable {
    @Override
    public void walk(){
        System.out.println("walking normally....");
    }
}
class Nowalk implements Walkable {
    @Override
    public void walk(){
        System.out.println("Cannot walk sorry !...");
    }
}
interface Flyable {
    public void fly();
}

class NormalFly implements Flyable{
    @Override
    public void fly(){
        System.out.println("Flying Normally!........");
    }
}

class Nofly implements Flyable {
    @Override
    public void fly(){
        System.out.println("Cannot fly ! .....");
    }
}

interface Talkable {
    public void talk();
}

class NormalTalk implements Talkable{
    @Override
    public void talk(){
        System.out.println("Talking Normally .....");
    }
}

class NoTalk implements Talkable{
    @Override
    public void talk(){
        System.out.println("No talk ...");
    }
}

abstract class Robot {
    Walkable walkBehaviour;
    Flyable flyBehaviour;
    Talkable talkBehavior;

    public Robot(Walkable w,Talkable t,Flyable f) {
        this.walkBehaviour = w;
        this.flyBehaviour = f;
        this.talkBehavior = t;
    }
    
    public void walk(){
        walkBehaviour.walk();
    }
    public void talk(){
        talkBehavior.talk();
    }
    public void fly(){
        flyBehaviour.fly();
    }

    public abstract void projection();
}

class CompanionRobot extends Robot {

    public CompanionRobot(Walkable w,Talkable t,Flyable f) {
        super(w,t,f);
    }
    
    @Override
    public void projection(){
        System.out.println("Hi sir I am your ComapnionRobot");
    }
}

public class A_Strategy_Design_pattern {
    public static void main(String[] args) {
        Robot R1 = new CompanionRobot(new NormalWalk(), new NormalTalk(), new Nofly());
        Robot R2 = new CompanionRobot(new Nowalk(),new NormalTalk() ,new NormalFly());
        R1.projection();
        R1.fly();
        R2.projection();
        R2.fly();
    }    
}
