class ClassRoom {
    double length;
    double breadth;
    double height;
    double airSpace;
}

class Main {
  public static void main(String[] args) {

    ClassRoom theClass = classDimensions();
    int people = allowedPeople(theClass);
    displayPeople(people);
    

  }

public static ClassRoom classDimensions () {

    ClassRoom tempClass = new ClassRoom();
    tempClass.length = getValidDouble(2, 20, "Please enter the length of the classroom.");
    tempClass.breadth = getValidDouble(2, 20, "Please enter the breadth of the classroom.");
    tempClass.height = getValidDouble(2, 10, "Please enter the height of the classroom.");
    tempClass.airSpace = getValidDouble(5, 15, "Please enter the permitted airspace of the classroom.");

    return tempClass;
    
}

public static int allowedPeople (ClassRoom tempClass) {

    double roomVol = tempClass.length * tempClass.breadth * tempClass.height;
    int persons = (int) Math.floor(roomVol / tempClass.airSpace);
    return persons;
}

public static void displayPeople (int persons) {

    System.out.println("A maximum of " + persons + " people are allowed in the classroom.");

}

public static double getValidDouble (double min, double max, String msg) {

    double number = Keyboard.getReal(msg);
    while (number < min || number > max) {
        System.out.println("That is an invalid entry");
        number = Keyboard.getReal(msg);
    }
    return number;
}



}

