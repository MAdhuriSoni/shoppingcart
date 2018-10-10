 import java.util.*;
 public class Main {
     public static void main(String[] args) {
         System.out.println("Hello");

         Product vacuumCleaner = new Product("vacuum_cleaner", 100);
         Product pencil = new Product("pencil", 3);
         Product bike = new Product("bike", 200);
         Product pen = new Product("pen", 20);
         Product ink = new Product("ink", 50);

         ShoppingCart cart = new ShoppingCart();

         cart.addProduct(pen);
         cart.addProduct(pen);
         cart.addProduct(pen);
         cart.addProduct(pen);
         cart.addProduct(ink);
         cart.addProduct(ink);
         cart.addProduct(ink);
        cart.addProduct(bike);
        cart.addProduct(bike);
       cart.replace(pen, pencil);


         System.out.println(cart.totalPrice());

     }
 }

//            Map<String,Object> polObject = new LinkedHashMap<>();
//            polObject.put("Name",pol.getName());
//            polObject.put("Age", pol.getAge());
//            polObject.put("Gender", pol.getGender());
//
//            System.out.println(polObject);
//
//            List<Object> familyArrayOfObject = new ArrayList<>();
//            for (Human human : family) {
//                Map<String,Object> familyMember = new LinkedHashMap<>();
//                familyMember.put("name", human.getName());
//                familyMember.put("age", human.getAge());
//                familyMember.put("gender", human.getGender());
//                familyArrayOfObject.add(familyMember);
//            }
//            System.out.println(familyArrayOfObject);
//        }
//    }
