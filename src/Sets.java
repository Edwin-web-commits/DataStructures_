import java.util.HashSet;
import java.util.Set;

public class Sets {



        public static void main(String[] args)
        {   // LinkedHash -> a collection of items in the list they were entered
            // HashSet-> a collection of items in a random order
            //TreeSet
            HashSet<String> animals=new HashSet<String>();
            animals.add("Dog");
            animals.add("cat");
            animals.add("puppy");
            animals.add("horse");
            animals.add("duck");
            //  System.out.println(animals) ;
            //create a new set that we use for comparing
            HashSet<String> pets=new HashSet<String>();
            pets.add("Dog");
            pets.add("cat");
            pets.add("rabbit");
            pets.add("bird");
            //Now create a Set that will store animals that are found in both sets.Now compare the two sets and get the animals that are found in both sets.
            Set<String> interSection= new HashSet<String>(pets);
            interSection.retainAll(animals);
            System.out.println("intersection is:" + interSection) ;
            // Now create a Set that will store the combined HashSets .now unite the two sets..(Both animals and pets put together)
            Set<String> union=new HashSet<String>(animals);
            union.addAll(pets);
            System.out.println("Union is" + union);
            //now we need to see the animals that are not in both sets( not shared).Create a Set to store them.(Animals but not pets)
            Set<String> NotSharedAnimals=new HashSet<String>(animals);
            NotSharedAnimals.removeAll(pets);
            System.out.println("Not shared animals are:" + NotSharedAnimals);

        }
    }

