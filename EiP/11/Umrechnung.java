public class Umrechnung {


	public static int[] umrechnen(int sekunden){
		int[] arr = new int[3];
			arr[0] = sekunden/3600;
			sekunden = sekunden - arr[0]*3600;
			arr[1] = sekunden/60;
			sekunden = sekunden - arr[1]*60;
			arr[2] = sekunden;
		return arr;
	}

	public static String pluralOutput(int n, String word, String post){
		if (n < 1) {
			return "";
		} else if (n>1) {
			return n + " " + word + "n" + post;
		}
		return n + " " + word + post;
	}

	public static String arrOutput(int[] arr, int id, String word){
		return pluralOutput(arr[id], word, connector(arr, id));
	}

	public static String switchWord(int n, String word1, String word2){
		if (n>1) {
			return word2;
		} else {
			return word1;
		}
	}
	public static String connector(int[] arr, int id){
		if (id == 1 || (id == 0 && (arr[id + 2] == 0 || arr[id+1]==0))) {
			return " und ";
		} else if (id != 2 && arr[id+1] != 0){
			return ", ";
		}
		else {
			return "";
		}
	}

	public static void main(String[] args) {

		int sek = Integer.parseInt(args[0]);
		int[] um = umrechnen(sek);

		System.out.println(
			pluralOutput(sek, "Sekunde", " ") +
			switchWord(sek, "ergibt", "ergeben") + " " +
			arrOutput(um,0, "Stunde") +
			arrOutput(um,1, "Minute") +
			arrOutput(um,2, "Sekunde") + "."
		);
	}

}