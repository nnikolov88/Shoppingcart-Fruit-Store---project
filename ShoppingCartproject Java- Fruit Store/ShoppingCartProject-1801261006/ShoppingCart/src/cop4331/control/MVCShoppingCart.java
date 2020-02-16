package cop4331.control;

import cop4331.data.Model;
import cop4331.gui.View;

public class MVCShoppingCart {

	public static void main(String[] args) {
		Model model = new Model();
		View view = new View();
		@SuppressWarnings("unused")
		Controller controller = new Controller(model, view);
		view.setBounds(100, 100, 500, 500);
		view.setVisible(true);
	}

}
