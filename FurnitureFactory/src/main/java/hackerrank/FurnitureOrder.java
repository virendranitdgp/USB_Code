package hackerrank;

import java.util.HashMap;
import java.util.Map;

public class FurnitureOrder implements FurnitureOrderInterface {
	/**
	 * TODO: Create a map of Furniture items to order quantities
	 * 
	 */
	static HashMap<Furniture, Integer> map = new HashMap<Furniture, Integer>();

	/**
	 * Initialize a new mapping of Furniture types to order quantities.
	 */
	FurnitureOrder() {
		// TODO: Complete the constructor
	}

	public void addToOrder(final Furniture type, final int furnitureCount) {
		// TODO: Complete the method
		map.put(type, furnitureCount);
	}

	public HashMap<Furniture, Integer> getOrderedFurniture() {
		// TODO: Complete the method
		return map;
	}

	public float getTotalOrderCost() {
		// TODO: Complete the method
		float result = 0.0f;
		for (Furniture fur : map.keySet()) {
			if (fur.equals(Furniture.CHAIR)) {
				result += map.get(fur) * 100.0f;
			}

			if (fur.equals(Furniture.TABLE)) {
				result += map.get(fur) * 250.0f;
			}

			if (fur.equals(Furniture.COUCH)) {
				result += map.get(fur) * 500.0f;
			}

		}
		return result;
	}

	public int getTypeCount(Furniture type) {
		// TODO: Complete the method
		if (map.containsKey(type)) {
			return map.get(type);
		} else {
			return 0;
		}
	}

	public float getTypeCost(Furniture type) {
		// TODO: Complete the method
		if (type.equals(Furniture.CHAIR) && map.containsKey(type)) {
			return map.get(type) * 100.0f;
		}
		if (type.equals(Furniture.COUCH) && map.containsKey(type)) {
			return map.get(type) * 500.0f;
		}
		if (type.equals(Furniture.TABLE) && map.containsKey(type)) {
			return map.get(type) * 250.0f;
		}
		return 0;

	}

	public int getTotalOrderQuantity() {
		// TODO: Complete the method
		return -1;
	}
}