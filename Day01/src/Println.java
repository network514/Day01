public class Println {
	public static void main(String[] args){
	System.out.print("�� ���� : ");
	System.out.println(10); // ���ڴ� �ֵ���ǥ ���� ǥ�� �����ϴ�.
	System.out.print("���� ���� : ");
	System.out.println(5);
	System.out.print("�� ���̿� ���� ������ �� : ");
	System.out.print("10 + 5 = "); // �ֵ���ǥ ���� �׸�ó�� �״�� ȭ�鿡 ��µȴ�.(��� �ȵ�)
	System.out.println(10+5);

	System.out.printf("%d + %d = %d\n", 10, 5, 10+5);

	System.out.print("�ƹ��� ���� :");
	System.out.println(30);
	System.out.println("��Ӵ� ���� : " + 20); // ����Ϸ��� ����� + ��ȣ�� �̿��ؼ� ���������� �����ϴ� ����� �� �ִ�.
	System.out.println("������ ���� : " + 3 + "��, ����� ���� : " + 2 + "��");
	
	System.out.print("������ ���� + ����̳��� : ");
	System.out.print( 3 + 2 );
	System.out.print("������ ���� + ����̳��� : " + 3 + 2);
	System.out.println("" + 3 + 2);
	// ���ڿ� ���ڿ� ���� + ��ȣ�� �̿��� �� �տ� "" ������ ��� ����� ������
	// �ڿ� �ִ� ���ڵ��� �׸����� �ν��Ѵ�.
	
	System.out.print("������ ���� + ����̳��� : " + (3 + 2) );
	
	// System.out.println("");
	// ���� ������ ���� ��
	System.out.println("�ƹ��� ����" + 53 +"��" + "+ ��Ӵ� ����" + 49 +"��" + "+ �� ����" + 23 +"��" + "���� ����" + 22 +"�� => ");
	System.out.println("���������� ������ " + (53+49+23+22) + "�� �̴�.");
	
	System.out.println("�׸� ��� ����");
	System.out.println("10");
	System.out.println("���� ��� ����");
	System.out.println(20);
	// ���� ������ 20
	System.out.println(12.34); // �Ҽ��� �� ���� : �Ǽ�

	System.out.println("�ѱ��� ������ ��� ����");
	System.out.println('A');
	// �ѱ��� �����ʹ� �ݵ�� �ܵ���ǥ ǥ�� !!!
	System.out.println('��');

	System.out.println("�� ������ : " + 'C' + "��");
	System.out.println("�ƹ��� - ���� : " + 30 + "��, Ű : " + 178.9 + "cm, ������ : " + 'B' + "��");
	
	}
}