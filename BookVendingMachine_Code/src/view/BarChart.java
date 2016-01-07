package view;


import javax.swing.JFrame;

import model.MasterVM;

import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.CategoryDataset;

/**
 *This class will display bar chart based on vending machines statistics
 * 
 * @author Venkata Kambalapalli,Priyanka Rao
 *
 */
public class BarChart {

	JFrame barFrame;

	/**
	 * Create the application.
	 */
	public BarChart() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		barFrame = new JFrame();

		MasterVM mVM = new MasterVM();
		final CategoryDataset dataset = mVM.createDataset();
		final JFreeChart chart = mVM.createBarGraph(dataset);
		final ChartPanel chartPanel = new ChartPanel(chart);
		barFrame.getContentPane().add(chartPanel);
		barFrame.setBounds(100, 100, 450, 300);

	}

}
