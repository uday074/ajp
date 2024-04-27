

import javax.swing.*;

public class menubar {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("Menu with Submenu Example");

        // Create a JMenuBar
        JMenuBar menuBar = new JMenuBar();

        // Create top-level menus
        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");
        JMenu helpMenu = new JMenu("Help");

        // Create submenus
        JMenu newSubMenu = new JMenu("New");
        JMenu pasteSubMenu = new JMenu("Paste");

        // Create menu items
        JMenuItem openMenuItem = new JMenuItem("Open");
        JMenuItem saveMenuItem = new JMenuItem("Save");
        JMenuItem exitMenuItem = new JMenuItem("Exit");

        JMenuItem cutMenuItem = new JMenuItem("Cut");
        JMenuItem copyMenuItem = new JMenuItem("Copy");

        JMenuItem paste1MenuItem = new JMenuItem("Paste Option 1");
        JMenuItem paste2MenuItem = new JMenuItem("Paste Option 2");

        JMenuItem aboutMenuItem = new JMenuItem("About");

        // Add menu items to top-level menus
        fileMenu.add(newSubMenu);
        fileMenu.add(openMenuItem);
        fileMenu.add(saveMenuItem);
        fileMenu.addSeparator(); // Add a separator
        fileMenu.add(exitMenuItem);

        editMenu.add(cutMenuItem);
        editMenu.add(copyMenuItem);
        editMenu.add(pasteSubMenu); // Add submenu to Edit menu

        pasteSubMenu.add(paste1MenuItem); // Add items to the Paste submenu
        pasteSubMenu.add(paste2MenuItem);

        helpMenu.add(aboutMenuItem);

        // Add top-level menus to the menu bar
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        // Set the menu bar to the frame
        frame.setJMenuBar(menuBar);

        // Set frame properties
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
