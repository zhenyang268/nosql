public class Path{

	public List<String> find(TreeNode root){
		List<String> paths = new ArrayList<>();
		if(root==null){
			return paths;
		}
		List<String> leftPaths = find(root.left);
		List<String> rightPaths = find(root.right);

		for(String path:leftPaths){
			paths.add(root.value+"->"+path);
		}
		for(String path:rightPaths){
			paths.add(root.value+"->"+path);
		}

		if(paths.size()==0){
			paths.add(""+root.value);
		}
		return paths;
	}
	
	
}