// Method/snippet only. Add required imports and HackerRank node types in the editor.

public static List<Integer> matchingStrings(List<String> stringList, List<String> queries) {
    Map<String, Integer> counts = new HashMap<>();
    for (String s : stringList) {
        counts.put(s, counts.getOrDefault(s, 0) + 1);
    }

    List<Integer> result = new ArrayList<>();
    for (String query : queries) {
        result.add(counts.getOrDefault(query, 0));
    }
    return result;
}
