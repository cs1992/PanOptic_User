package com.kitri.user.order;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class OrderFoodPane extends JPanel {

    // String foodName[]={"������������","�ҺҰ��ⵤ��","��¡���","ī�����̽�","������ ","ġŲ���䵤��
    // ","��� ","������","����","���","���","�ع����","���ζ��","ġ����","���ζ��","¥����"
    // ,"��ġ������","��ä������","��ū�쵿","���ο쵿","�ſ�쵿","�Ҽ���������","��ġ�","���ܺ���","¥���"};
    // String foodPrice[]
    // ={"5000��","6000��","5000��","5000��","6000��","6500��","6500��","3000��","4000��","2500��","2500��","3000��","4000��","4000��","4000��","3000��"
    // ,"5000��","5000��","5000��","5000��","5000��","6000��","6000��","6000��","6000��"};

    /**
     * Launch the application.
     */

    /**
     * Create the frame.
     */

    public Vector col = new Vector<>();
    public Vector rowDatas = new Vector<>();
    JTable table;

    public OrderFoodPane() {
	// String columnNames[] = { "����", "���ĸ޴�", "����" };
	col.add("����");
	col.add("���ĸ޴�");
	col.add("����");
	// setRowData();
	// Vector temp = new Vector();
	// temp.add("img");
	// temp.add("����");
	// temp.add(5000);
	// rowDatas.addElement(temp);
	// temp = new Vector<>();
	// temp.add("img");
	// temp.add("��ġ��");
	// temp.add("25000");
	// rowDatas.addElement(temp);

	// Object rowData[][] = { { "img", "������������", "5000��" }, { "img",
	// "�ҺҰ��ⵤ��", "6000��" } };

	// JTable jTable = new JTable(rowData, columnNames);
	table = new JTable(rowDatas, col);

	JScrollPane scrollPane = new JScrollPane(table);
	add(scrollPane);

    }

    private void setRowData() {
	int size = 90;

	Vector temp = new Vector();
	int count = 0;
	for (int i = 0; i < size; i++) {
	    if (count < 3) {
		temp.add(i);
		count++;
	    } else {
		rowDatas.addElement(temp);
		temp = new Vector();
		count = 0;
	    }

	}

    }

}
