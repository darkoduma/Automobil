
import loops.Loops;
import person.Person;
import person.Student;
import person.Teacher;


public class Main {
    
    public static void main(String[] args) {

//        Car myCar = new Car();
//        myCar.printAttributes();
//
//        Car companyCar = new Car(150, 30, 2000, false, "EFG-456", 'B', 3500, 60000);
//        companyCar.changeModel("Fiat");
//        companyCar.changeMaxFuel(150);
//        companyCar.fuelUp();
//        companyCar.changeConsumption(10);
//        companyCar.printMainAttributes();
//        companyCar.travel(20);
//        companyCar.printMainAttributes();
//
//        Car audi = new Car();
//        audi.changeModel("audi");
//        audi.fuelUp();
//        audi.changeConsumption(20);
//        
//        audi.printMainAttributes();
//        audi.travel(3);
//        audi.printMainAttributes();
//        audi.travel(3);
//        audi.printMainAttributes();
//        Car testAuto = new Car();
//        testAuto.getIn();
//        testAuto.printMainAttributes();
//        testAuto.getIn();
//        testAuto.printMainAttributes();
//        testAuto.getIn();
//        testAuto.printMainAttributes();
//        testAuto.getIn();
//        testAuto.printMainAttributes();
//        testAuto.getIn();
//        testAuto.printMainAttributes();
//        testAuto.getIn();
//        testAuto.printMainAttributes();
//        testAuto.getOut();
//        testAuto.printMainAttributes();

//        testAuto.printMainAttributes();
////        testAuto.getOut(2);
//        testAuto.getIn(3);
//        testAuto.printMainAttributes();
//        testAuto.getOut(2);
//        
//          Loops testLoop = new Loops();
//          Loops.testWhileLoop();
//          Loops.testDoWhileLoop();
//          Loops.testForLoop();
          
//          Loops.testDoubleForLoop();

//            Loops.testMultiplicationTable();
          
        Person p1 = new Person();
        p1.showData();
        p1.setName("Petar");
        p1.setSurname("Petrovic");
        p1.setJmbg("0112987700058");
        
        p1.showData();  
              
              
        Person p2 = new Person("Petar", "Petrovic", "0112987700058");
        p2.showData();
        
        Student studentJovan = new Student ("Jovan", "Jovanovic", "2235");
        studentJovan.setCurrentYear(4);
        studentJovan.setIndexNumber("oas - 456");
        studentJovan.showData();
        
        Student studentMarja = new Student("Marija", "Maricic","326448");
        studentMarja.showData();
          

        Teacher teacherMarko = new Teacher ("Marko", "Markovic", "0545554", "Serbijan", 25);
        teacherMarko.showData();

    }
    
}
