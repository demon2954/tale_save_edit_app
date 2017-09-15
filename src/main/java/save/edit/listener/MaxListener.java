package save.edit.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import save.edit.data.PropertyValueEnum;

public class MaxListener implements ActionListener {
	private JTextField[] propertyTextFields;// 属性文本数组
	
	private JTextField hpTextField;// HP文本
	private JTextField mpTextField;// MP文本
	private JTextField attackTextField;// 攻击力文本
	private JTextField defendTextField;// 防御力文本

	public void actionPerformed(ActionEvent e) {
		for (PropertyValueEnum one : PropertyValueEnum.values()) {
			int propertyIdx = one.getPropertyIndex();
			int iMax = one.getM_iMax();
			
			JTextField field = propertyTextFields[propertyIdx];
			field.setText(iMax + "");
		}
		
		hpTextField.setText("9999");
		mpTextField.setText("9999");
		attackTextField.setText("1000");
		defendTextField.setText("1000");
	}

	public MaxListener(JTextField[] propertyTextFields, JTextField hpTextField, JTextField mpTextField,
			JTextField attackTextField, JTextField defendTextField) {
		super();
		this.propertyTextFields = propertyTextFields;
		this.hpTextField = hpTextField;
		this.mpTextField = mpTextField;
		this.attackTextField = attackTextField;
		this.defendTextField = defendTextField;
	}
}
