// package desktop.reflection;

// public class ReflectionTemp {
// public void triggerReflectionStuff()
// throws NoSuchFieldException, SecurityException, IllegalArgumentException,
// IllegalAccessException,
// NoSuchMethodException, InvocationTargetException, InstantiationException,
// ClassNotFoundException {

// // ---------------------------- FIELDS ---------------------------- //
// Class person = Class.forName("desktop.reflection.Employee");

// System.out.println("Class we got was: " + person);

// var classObj = person.getClass();

// System.out.println("FIELDS");
// System.out.println("\n\n");

// var fields = classObj.getDeclaredFields();

// // Get class information at runtime
// for (Field field : fields) {
// System.out.println("Name: " + field.getName());
// System.out.println("Type: " + field.getType());
// }

// var field = classObj.getDeclaredField("name");

// // This allows us to access a private field on runtime
// field.setAccessible(true);

// // And then we can actually change a private field at runtime because it was
// // made accessible - however it did not CHANGE it to public
// field.set(person, "new name");

// System.out.println(person);

// // ---------------------------- METHODS ---------------------------- //
// System.out.println("\n\n");
// System.out.println("METHODS");
// System.out.println("\n\n");
// var methods = classObj.getDeclaredMethods();

// for (Method method : methods) {
// System.out.println("Name of method: " + method.getName());
// System.out.println("ParameterCount: " + method.getParameterCount());
// System.out.println("Return Type: " + method.getReturnType());
// }

// var methodOne = classObj.getDeclaredMethod("greet", String.class);

// methodOne.invoke(person, "Rallefar");

// var methodTwo = classObj.getDeclaredMethod("add", Integer.TYPE,
// Integer.TYPE);

// var resultOfAdd = methodTwo.invoke(person, 10, 5);

// System.out.println(resultOfAdd);

// // ---------------------------- CONSTRUCTORS ---------------------------- //
// System.out.println("\n\n");
// System.out.println("CONSTRUCTORS");
// System.out.println("\n\n");

// var constructors = classObj.getConstructors();

// for (Constructor<?> constructor : constructors) {
// System.out.println("Name of constructor: " + constructor.getName());
// System.out.println("Parameter count: " + constructor.getParameterCount());

// }

// var constructor = classObj.getConstructor(String.class, Integer.TYPE);

// var anotherPerson = constructor.newInstance("Niels", 22);
// }
// }
