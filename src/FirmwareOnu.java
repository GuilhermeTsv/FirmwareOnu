import java.util.Scanner;

public class FirmwareOnu{

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Quantidade de onu:");
        int qtdOnu = scan.nextInt();
        String [] onu = new String[qtdOnu];
        scan.nextLine();

        StringBuilder onuFormatada = new StringBuilder();

        for (int i = 0; i < qtdOnu ; i++) {
            System.out.println("Serial da " + (i+1) + "º onu");
            onu[i] = scan.nextLine();
            onuFormatada.append("configure equipment ont interface 1/1/1/16/").append(i + 1).append(" admin-state down\n")
                    .append("configure equipment ont no interface 1/1/1/16/").append(i + 1).append("\n")
                    .append("configure equipment ont interface 1/1/1/16/").append(i + 1)
                    .append(" sw-ver-pland auto sw-dnload-version auto pland-cfgfile1 auto dnload-cfgfile1 auto sernum ").append("ALCL:").append(onu[i]).append("\n")
                    .append("configure equipment ont interface 1/1/1/16/").        append(i + 1).append(" admin-state up\n");
            onuFormatada.append("\n");
        }
        System.out.println(onuFormatada);

        scan.close();
    }
}


