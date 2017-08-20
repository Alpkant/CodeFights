boolean containsDuplicates(int[] a) {
    Set<Integer> lump = new HashSet<Integer>();
  for (int i : a)
  {
    if (lump.contains(i)) return true;
    lump.add(i);
  }
  return false;
}
