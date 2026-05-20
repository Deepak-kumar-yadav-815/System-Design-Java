public class noSingleton {

    public noSingleton() {
        System.out.println("Singleton has been formed ..."+'\n'+"constructor has been called");
    }
    
    public static void main(String[] args) {
        noSingleton s1 = new noSingleton();
        noSingleton s2 = new noSingleton();
        System.out.println(s1==s2); 
    }    
}
