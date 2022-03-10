public class Encapsulation {

    // ENCAPSULATION EXAMPLE.


    String car_name = "";
    String car_model = "";

    // Only showing the user/outer world, what is need and hiding other important informations.

    void add(){
        validate();
        Add_to_database();

        // Encapsulation is actually bringing down complexity by hiding data.
        // In other words, Encapsulation implements Abstraction.

    }

    private void validate(){
        /* some code */
    }
    private void Add_to_database(){
        /* some code */
    }

}
