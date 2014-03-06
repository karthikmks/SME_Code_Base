package com.bfp.valueobjects;

import java.util.List;

/**
 * @author tiruppathir
 *
 */
public class SearchResponseVO {

	private SearchRequestVO searchRequestVO;
	private JewelLoanTransactionVO jewelLoanTransactionVO;
	private DepositLoanTransactionVO depositLoanTransactionVO;
	/**
	 * @return the searchRequestVO
	 */
	public SearchRequestVO getSearchRequestVO() {
		return searchRequestVO;
	}
	/**
	 * @param searchRequestVO the searchRequestVO to set
	 */
	public void setSearchRequestVO(SearchRequestVO searchRequestVO) {
		this.searchRequestVO = searchRequestVO;
	}
	/**
	 * @return the jewelLoanTransactionVO
	 */
	public JewelLoanTransactionVO getJewelLoanTransactionVO() {
		return jewelLoanTransactionVO;
	}
	/**
	 * @param jewelLoanTransactionVO the jewelLoanTransactionVO to set
	 */
	public void setJewelLoanTransactionVO(
			JewelLoanTransactionVO jewelLoanTransactionVO) {
		this.jewelLoanTransactionVO = jewelLoanTransactionVO;
	}
	/**
	 * @return the depositLoanTransactionVO
	 */
	public DepositLoanTransactionVO getDepositLoanTransactionVO() {
		return depositLoanTransactionVO;
	}
	/**
	 * @param depositLoanTransactionVO the depositLoanTransactionVO to set
	 */
	public void setDepositLoanTransactionVO(
			DepositLoanTransactionVO depositLoanTransactionVO) {
		this.depositLoanTransactionVO = depositLoanTransactionVO;
	}
	
	private List<JewelLoanTransactionVO> jewelLoans;
	/**
	 * @return the jewelLoans
	 */
	public List<JewelLoanTransactionVO> getJewelLoans() {
		return jewelLoans;
	}
	/**
	 * @param jewelLoans the jewelLoans to set
	 */
	public void setJewelLoans(List<JewelLoanTransactionVO> jewelLoans) {
		this.jewelLoans = jewelLoans;
	}
	/**
	 * @return the depositLoans
	 */
	public List<JewelLoanTransactionVO> getDepositLoans() {
		return depositLoans;
	}
	/**
	 * @param depositLoans the depositLoans to set
	 */
	public void setDepositLoans(List<JewelLoanTransactionVO> depositLoans) {
		this.depositLoans = depositLoans;
	}

	private List<JewelLoanTransactionVO> depositLoans;
}