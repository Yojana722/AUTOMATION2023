package LogicalPrograms;

public class remove_whitespaces_in_String {

	public static void main(String[] args) {
		String str = "quantum academy pune";

		str = str.replaceAll(" ", "");
		System.out.println(str);//quantumacademypune
	}
}
