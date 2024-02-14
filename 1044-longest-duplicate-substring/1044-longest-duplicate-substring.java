class Solution {
    public String longestDupSubstring(String s) {
        return Longest(s);
    }
    public static String Longest(String s) {
		int lo=1;
		int hi=s.length();
		String ans="";
		while(lo<=hi) {
			int mid=(lo+hi)/2;
			String str=result(s,mid);
			if(str.length()>0) {
				ans=str;
				lo=mid+1;
			}
			else {
				hi=mid-1;
			}
		}
		return ans;
	}

	private static String result(String s, int mid) {
		// TODO Auto-generated method stub
		long hsvalue=0;
		long mod=1000_000_007;
		long pr=31;
		long pow=1;
		for(int i=mid-1;i>=0;i--) {
			hsvalue=(hsvalue+((s.charAt(i)-'a'+1)*pow)%mod)%mod;
			if(i>0) {
				pow=(pow*pr)%mod;
			}
		}
		HashMap<Long, ArrayList<Integer>> map=new HashMap<>();
		map.put(hsvalue, new ArrayList<>());
		map.get(hsvalue).add(0);
		for(int ei=mid,si=0;ei<s.length();si++,ei++) {
			hsvalue=(hsvalue-((s.charAt(si)-'a'+1)*pow)%mod+mod)%mod;
			hsvalue=(hsvalue*pr)%mod;
			hsvalue=(hsvalue+s.charAt(ei)-'a'+1)%mod;
			if(map.containsKey(hsvalue)) {
				String curr=s.substring(si+1,ei+1);
				for(int st:map.get(hsvalue)) {
					if(curr.equals(s.substring(st,st+mid))) {
						return curr;
					}
				}
				map.get(hsvalue).add(si+1);
			}else {
				map.put(hsvalue, new ArrayList<>());
				map.get(hsvalue).add(si+1);
			}
		}
		return "";
	}

}