import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class kaisin1 {
    private JFrame frame;
    private JTextField bukikaisin;

    private JCheckBox mikiri1, mikiri2, mikiri3, mikiri4, mikiri5;
    private JCheckBox jakutoku1, jakutoku2, jakutoku3, jakutoku4, jakutoku5;
    private JCheckBox tyousen1, tyousen2, tyousen3, tyousen4, tyousen5;
    private JCheckBox muga1, muga2, muga3;
    private JCheckBox shokukou;
    private JCheckBox konsin1, konsin2, konsin3;
    private JCheckBox kaihou1, kaihou2, kaihou3, kaihou4, kaihou5;
    private JCheckBox renkei1, renkei2;

    private JLabel resultLabel;

    public kaisin1() {
        // フレーム作成
        frame = new JFrame("ワイルズ会心率計算");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 800);
        frame.setLayout(new BorderLayout(10, 10));

        // パネルを作成して中央に配置
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        // 武器会心率
        JPanel inputPanel = new JPanel();
        inputPanel.add(new JLabel("武器会心率:"));
        bukikaisin = new JTextField(4);
        bukikaisin.setText("0");
        inputPanel.add(bukikaisin);
        panel.add(inputPanel, gbc);


        // 各スキルのチェックボックス配置
        gbc.gridwidth = 1;

        mikiri1 = new JCheckBox("見切りLv1 +4%");
        mikiri2 = new JCheckBox("見切りLv2 +8%");
        mikiri3 = new JCheckBox("見切りLv3 +12%");
        mikiri4 = new JCheckBox("見切りLv4 +16%");
        mikiri5 = new JCheckBox("見切りLv5 +20%");

        jakutoku1 = new JCheckBox("弱点特攻Lv1 +5%(8%)");
        jakutoku2 = new JCheckBox("弱点特攻Lv2 +10%(15%)");
        jakutoku3 = new JCheckBox("弱点特攻Lv3 +15%(25%)");
        jakutoku4 = new JCheckBox("弱点特攻Lv4 +20%(35%)");
        jakutoku5 = new JCheckBox("弱点特攻Lv5 +30%(50%)");

        tyousen1 = new JCheckBox("挑戦者Lv1 +3%");
        tyousen2 = new JCheckBox("挑戦者Lv2 +5%");
        tyousen3 = new JCheckBox("挑戦者Lv3 +7%");
        tyousen4 = new JCheckBox("挑戦者Lv4 +10%");
        tyousen5 = new JCheckBox("挑戦者Lv5 +15%");

        muga1 = new JCheckBox("無我の境地Lv1 (克服込み) +18%");
        muga2 = new JCheckBox("無我の境地Lv2 (克服込み) +21%");
        muga3 = new JCheckBox("無我の境地Lv3 (克服込み) +25%");

        konsin1 = new JCheckBox("渾身Lv1 +10%");
        konsin2 = new JCheckBox("渾身Lv2 +20%");
        konsin3 = new JCheckBox("渾身Lv3 +30%");

        kaihou1 = new JCheckBox("力の解放Lv1 +10%");
        kaihou2 = new JCheckBox("力の解放Lv2 +20%");
        kaihou3 = new JCheckBox("力の解放Lv3 +30%");
        kaihou4 = new JCheckBox("力の解放Lv4 +40%");
        kaihou5 = new JCheckBox("力の解放Lv5 +50%");

        renkei1 = new JCheckBox("連携プログラムLv1 +15%");
        renkei2 = new JCheckBox("連携プログラムLv2 +25%");

        shokukou = new JCheckBox("蝕攻の装衣 +30%");

        // 各スキルをパネルに追加
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(mikiri1, gbc);

        gbc.gridx = 1;
        panel.add(mikiri2, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(mikiri3, gbc);

        gbc.gridx = 1;
        panel.add(mikiri4, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(mikiri5, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        panel.add(jakutoku1, gbc);

        gbc.gridx = 1;
        panel.add(jakutoku2, gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        panel.add(jakutoku3, gbc);

        gbc.gridx = 1;
        panel.add(jakutoku4, gbc);

        gbc.gridx = 0;
        gbc.gridy = 6;
        panel.add(jakutoku5, gbc);

        gbc.gridx = 0;
        gbc.gridy = 7;
        panel.add(tyousen1, gbc);

        gbc.gridx = 1;
        panel.add(tyousen2, gbc);

        gbc.gridx = 0;
        gbc.gridy = 8;
        panel.add(tyousen3, gbc);

        gbc.gridx = 1;
        panel.add(tyousen4, gbc);

        gbc.gridx = 0;
        gbc.gridy = 9;
        panel.add(tyousen5, gbc);

        gbc.gridx = 0;
        gbc.gridy = 10;
        panel.add(muga1, gbc);

        gbc.gridx = 1;
        panel.add(muga2, gbc);

        gbc.gridx = 0;
        gbc.gridy = 11;
        panel.add(muga3, gbc);

        gbc.gridx = 0;
        gbc.gridy = 13;
        panel.add(konsin1, gbc);

        gbc.gridx = 1;
        panel.add(konsin2, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 15;
        panel.add(konsin3, gbc);

        gbc.gridx = 0;
        gbc.gridy = 16;
        panel.add(kaihou1, gbc);

        gbc.gridx = 1;
        panel.add(kaihou2, gbc);

        gbc.gridx = 0;
        gbc.gridy = 17;
        panel.add(kaihou3, gbc);

        gbc.gridx = 1;
        panel.add(kaihou4, gbc);

        gbc.gridx = 0;
        gbc.gridy = 18;
        panel.add(kaihou5, gbc);

        gbc.gridx = 0;
        gbc.gridy = 19;
        panel.add(renkei1, gbc);

        gbc.gridx = 1;
        panel.add(renkei2, gbc);

        gbc.gridx = 0;
        gbc.gridy = 12;
        gbc.gridwidth = 2;
        panel.add(shokukou, gbc);

        // 結果表示
        resultLabel = new JLabel("合計会心率: 0%", JLabel.CENTER);
        resultLabel.setForeground(Color.RED);
        frame.add(resultLabel, BorderLayout.NORTH);

        frame.add(panel, BorderLayout.CENTER);

        // リセット
        JPanel buttonPanel = new JPanel();
        JButton resetButton = new JButton("リセット");
        resetButton.addActionListener(e -> resetAllCheckboxes());
        buttonPanel.add(resetButton);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        // チェックボックスの状態
        ItemListener listener = new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getSource() instanceof JCheckBox) {
                    JCheckBox source = (JCheckBox) e.getSource();

                    if (source == mikiri1 || source == mikiri2 || source == mikiri3 || source == mikiri4 || source == mikiri5) {
                        deselectOther(source, mikiri1, mikiri2, mikiri3, mikiri4, mikiri5);
                    }
                    if (source == jakutoku1 || source == jakutoku2 || source == jakutoku3 || source == jakutoku4 || source == jakutoku5) {
                        deselectOther(source, jakutoku1, jakutoku2, jakutoku3, jakutoku4, jakutoku5);
                    }
                    if (source == tyousen1 || source == tyousen2 || source == tyousen3 || source == tyousen4 || source == tyousen5) {
                        deselectOther(source, tyousen1, tyousen2, tyousen3, tyousen4, tyousen5);
                    }
                    if (source == muga1 || source == muga2 || source == muga3) {
                        deselectOther(source, muga1, muga2, muga3);
                    }
                    if (source == konsin1 || source == konsin2 || source == konsin3) {
                        deselectOther(source, konsin1, konsin2, konsin3);
                    }
                    if (source == kaihou1 || source == kaihou2 || source == kaihou3 || source == kaihou4 || source == kaihou5){
                        deselectOther(source, kaihou1, kaihou2, kaihou3, kaihou4, kaihou5);
                    }
                    if (source == renkei1 || source == renkei2){
                        deselectOther(source, renkei1, renkei2);
                   }

                    // 会心率の更新
                    updatekaisin();
                }
            }
        };

        // スキルにリスナー追加
        mikiri1.addItemListener(listener);
        mikiri2.addItemListener(listener);
        mikiri3.addItemListener(listener);
        mikiri4.addItemListener(listener);
        mikiri5.addItemListener(listener);
        jakutoku1.addItemListener(listener);
        jakutoku2.addItemListener(listener);
        jakutoku3.addItemListener(listener);
        jakutoku4.addItemListener(listener);
        jakutoku5.addItemListener(listener);
        tyousen1.addItemListener(listener);
        tyousen2.addItemListener(listener);
        tyousen3.addItemListener(listener);
        tyousen4.addItemListener(listener);
        tyousen5.addItemListener(listener);
        muga1.addItemListener(listener);
        muga2.addItemListener(listener);
        muga3.addItemListener(listener);
        konsin1.addItemListener(listener);
        konsin2.addItemListener(listener);
        konsin3.addItemListener(listener);
        kaihou1.addItemListener(listener);
        kaihou2.addItemListener(listener);
        kaihou3.addItemListener(listener);
        kaihou4.addItemListener(listener);
        kaihou5.addItemListener(listener);
        renkei1.addItemListener(listener);
        renkei2.addItemListener(listener);

        shokukou.addItemListener(listener);

        frame.setVisible(true);
    }

    private void deselectOther(JCheckBox selected, JCheckBox... group) {
        if (!selected.isSelected()) {
            return;
        }
        for (JCheckBox cb : group) {
            if (cb != selected) {
                cb.setSelected(false);
            }
        }
    }

    private void resetAllCheckboxes() {
        // リセット
        mikiri1.setSelected(false);
        mikiri2.setSelected(false);
        mikiri3.setSelected(false);
        mikiri4.setSelected(false);
        mikiri5.setSelected(false);

        jakutoku1.setSelected(false);
        jakutoku2.setSelected(false);
        jakutoku3.setSelected(false);
        jakutoku4.setSelected(false);
        jakutoku5.setSelected(false);

        tyousen1.setSelected(false);
        tyousen2.setSelected(false);
        tyousen3.setSelected(false);
        tyousen4.setSelected(false);
        tyousen5.setSelected(false);

        muga1.setSelected(false);
        muga2.setSelected(false);
        muga3.setSelected(false);

        konsin1.setSelected(false);
        konsin2.setSelected(false);
        konsin3.setSelected(false);

        kaihou1.setSelected(false);
        kaihou2.setSelected(false);
        kaihou3.setSelected(false);
        kaihou4.setSelected(false);
        kaihou5.setSelected(false);

        renkei1.setSelected(false);
        renkei2.setSelected(false);

        shokukou.setSelected(false);

        // 会心率のリセット
        resultLabel.setText("合計会心率: 0%");
    }

    private void updatekaisin() {
        try {
            // 武器会心率の取得
            int baseCrit = Integer.parseInt(bukikaisin.getText());
            int totalCrit = baseCrit;

            // 各スキルによる加算
            if (mikiri1.isSelected()) totalCrit += 4;
            if (mikiri2.isSelected()) totalCrit += 8;
            if (mikiri3.isSelected()) totalCrit += 12;
            if (mikiri4.isSelected()) totalCrit += 16;
            if (mikiri5.isSelected()) totalCrit += 20;

            if (jakutoku1.isSelected()) totalCrit += 5;
            if (jakutoku2.isSelected()) totalCrit += 10;
            if (jakutoku3.isSelected()) totalCrit += 15;
            if (jakutoku4.isSelected()) totalCrit += 20;
            if (jakutoku5.isSelected()) totalCrit += 30;

            if (tyousen1.isSelected()) totalCrit += 3;
            if (tyousen2.isSelected()) totalCrit += 5;
            if (tyousen3.isSelected()) totalCrit += 7;
            if (tyousen4.isSelected()) totalCrit += 10;
            if (tyousen5.isSelected()) totalCrit += 15;

            if (muga1.isSelected()) totalCrit += 18;
            if (muga2.isSelected()) totalCrit += 21;
            if (muga3.isSelected()) totalCrit += 25;

            if (konsin1.isSelected()) totalCrit += 10;
            if (konsin2.isSelected()) totalCrit += 20;
            if (konsin3.isSelected()) totalCrit += 30;

            if (kaihou1.isSelected()) totalCrit += 10;
            if (kaihou2.isSelected()) totalCrit += 20;
            if (kaihou3.isSelected()) totalCrit += 30;
            if (kaihou4.isSelected()) totalCrit += 40;
            if (kaihou5.isSelected()) totalCrit += 50;

            if (renkei1.isSelected()) totalCrit += 15;
            if (renkei2.isSelected()) totalCrit += 25;


            if (shokukou.isSelected()) totalCrit += 30;

            totalCrit = Math.min(totalCrit, 200); // 上限200%

            resultLabel.setText("合計会心率: " + totalCrit + "%");
        } catch (NumberFormatException e) {
            resultLabel.setText("入力が無効です");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(kaisin1::new);
    }
}
