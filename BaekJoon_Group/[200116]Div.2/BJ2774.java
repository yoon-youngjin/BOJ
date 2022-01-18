public class BJ2774 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        ArrayList<Set<Character>> arr = new ArrayList<>();

        for (int i = 0; i < T; i++) {

            String temp = br.readLine();
            Set<Character> set = new HashSet<>();

            for (int j = 0; j < temp.length(); j++) {
                set.add(temp.charAt(j));
            }
            arr.add(set);
        }

        for (int i = 0; i < T; i++) {
            Set<Character> set = arr.get(i);
            System.out.println(set.size());
        }

    }
}
