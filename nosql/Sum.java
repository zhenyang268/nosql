public class Sum{
	private int min;
	private TreeNode minroot;


	public TreeNode find(TreeNode root){
		min = root.value;
		minroot = null;
		getSum(root);
		return minroot;
	}


	public int getSum(TreeNode root){
		if(root == null){
			return 0;
		}
		int sum = getSum(root.left)+getSum(root.right)+root.value;
		if(sum<min){
			min = sum;
			minroot = root;
		}
		return sum;
	}
}