public static void main(String[] args) {
Map<Integer,String> map = new HashMap<Integer,String>();
map.put(1,"Ashvin");
map.put(2,"Rutvik");
map.put(3,"Rushikesh");

map.forEach((k,v)-> System.out.println(k+" "+v));

if(map.containsKey(2)) {
map.remove(2);
}

System.out.println("After removing element with key as 3: \n");

map.forEach((k,v)-> System.out.println(k+" "+v));

String val = map.get(1);
System.out.println("Name of the Student with Roll no.1 is: "+val);
