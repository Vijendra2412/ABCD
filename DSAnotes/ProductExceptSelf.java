
public class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] output = new int[n];
        output[0] = 1;

        // Calculate left products
        for (int i = 1; i < n; i++) {
            output[i] = output[i - 1] * nums[i - 1];
        }

        // Calculate right products and multiply with left products
        int R = 1;  // Right product
        for (int i = n - 1; i >= 0; i--) {
            output[i] = output[i] * R;
            R *= nums[i];  // Update right product
        }
        return output;  // Return final output array
    }

    public static void main(String[] args) {
        ProductExceptSelf obj = new ProductExceptSelf();
        int[] nums = {1, 2, 3, 4};
        int[] result = obj.productExceptSelf(nums);
        
        // Print the result
        System.out.print("Product except self: ");
        for (int num : result) {
            System.out.print(num + " ");  // Output: 24 12 8 6
        }
    }
}
