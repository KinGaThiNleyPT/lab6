public class SequentialSearchSTTest{
	public static void main(String[] args) {
		SequentialSearchST<String, Integer> obj = new SequentialSearchST<String, Integer>();
		obj.put("a",3);
		obj.put("b",2);
		obj.put("c",4);
		obj.put("a",9);
		obj.delete("a");
		System.out.println(obj.keys());

		 
        System.out.println(obj.isEmpty());
        System.out.println(obj.size());



	}
}