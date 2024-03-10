import javax.swing.JOptionPane;

public class PlanejaRota {

    public void planejarDia() {

        String rotas;
        String km;
        String custoLitro;
        double calculoLitro;
        double custoTotal;

        StringBuilder output = new StringBuilder();

        rotas = JOptionPane.showInputDialog("Digite a quantidade de rotas realizadas: ");
        km = JOptionPane.showInputDialog("Digite a quantidade de quilometragem feita: ");
        int rotasInt = Integer.parseInt(rotas);
        float kmFloat = Float.parseFloat(km);
        output.append("Quantidade somada de quilometragem feita por rotas foram: " + (rotasInt * kmFloat) + " KM\n\n");

        custoLitro = JOptionPane.showInputDialog("Digite o preço do litro do óleo diesel: ");
        calculoLitro = ((rotasInt * kmFloat) * 2.5);
        output.append("Quantidade total necessária de combustível: " + calculoLitro + " L\n\n");

        float custoLitroFloat = Float.parseFloat(custoLitro);
        custoTotal = (calculoLitro * custoLitroFloat);
        output.append("Preço que será total que será desembolsado do litro de óleo diesel: R$" + custoTotal + "\n\n");

        JOptionPane.showMessageDialog(null, output);
    }
}