public class Week2 // arrays, loops, if/else
{
    public static void main(String[] args)
    {
        String name = "Michael"; //use breakpoints at the left here and click on little bug top right, then down blue arrow to watch execution of each line
        String output = "Yo " + name + "!";
        System.out.println(output);
        System.out.println("##############################################");
//------------------------------------------------------------------------------------------------
        int[] numbers = new int[5]; //new array with 5 lines

        numbers[0] = 16; //indexing of an array starts at zero
        numbers[1] = 36;
        numbers[2] = 6;
        numbers[3] = -1;
        numbers[4] = 56;

        //System.out.println(numbers); will not work so we need to loop through it to print out the array:

        for (int i = 0; i < 5; i++)
        {
            System.out.println(numbers[i]); // we have to loop through with this to print the line
        }
        System.out.println("##############################################");
//------------------------------------------------------- below is looping through starting at 1, ending at 10
        int numElements = 10; //size of the array
        int startingNumber = 1;
        int increment = 1; // adjust this number to count up in...
        int multiple = 5; // 2nd loop, see below

        int[] count = new int[numElements];
        int currentNumber = startingNumber;

        for (int i = 0; i < numElements; i++) //initialises array
        {
            count[i] = currentNumber;
            //currentNumber++; //add 1 onto current number
            currentNumber += increment; // adds starting number by whatever is set above
        }
        for (int i = 0; i < numElements; i++) //modifying the array by multiplying ny 5 (above)
        {
            count[i] *= multiple;
        }
        for (int i = 0; i < numElements; i++)// prints array
        {
            System.out.println(count[i]);
        }
        System.out.println("##############################################");
//------------------------------------------------------- Below is if statements
        int x = 107;

        if (x<10)
        {
            System.out.println("x is less than 10");
        }
        else if (x <= 100)
        {
            System.out.println("x is between 10 and 100");
        }
        else
        {
            System.out.println("x is greater than 100");
        }
        System.out.println("##############################################");
//------------------------------------------------------- loop through and if statements through an array:

        String[] animals = {"cat", "cat", "dog", "tortoise", "cat", "rabbit", "dog", "cat", "dog", "cat"};

        int numDogs = 0; // zero is inital value of array
        int numCats = 0;

        for (int i = 0; i < animals.length; i++) //if you dont know the number of elements in array use .length
        {
            if (animals[i] == "cat") //count number of cats in list
            {
                numCats++;
            }
            else if (animals[i] == "dog") //count number of dogs - performs another if statement
            {
                numDogs++;
            }
        }
        System.out.println("Number of cats: " + numCats);
        System.out.println("Number of dogs: " + numDogs);

        System.out.println("##############################################");

    //---------------------------------------------------------- min/mx and total of array:

        int[] ages = {24, 31, 29, 40, 18, 20, 42, 51};
        int maxAge = ages[0];
        int minAge = ages[0];
        int totAge = ages[0];

        for (int i = 0; i < ages.length; i++) //if you dont know the number of elements in array use .length
        {
            if (ages[i] > maxAge) //calls each age 1 by 1 and looks for largest number >
            {
                maxAge = ages[i];
            }
        }
        for (int i = 0; i > ages.length; i++) // reverse to > to find minimum
        {
            if (ages[i] > minAge);
            {
                minAge = ages[i];
            }
        }
        for (int i = 0; i < ages.length; i++) // back to <
        {
            if (ages[i] == totAge) ; // == return a true or false value
            {
                totAge += ages[i]; //shorthand for totAge = age + age
            }
        }
            System.out.println("Maximum age is: " + maxAge);
            System.out.println("Minimum age is: " + minAge);
            System.out.println("Total age is: " + totAge);
    }
}


