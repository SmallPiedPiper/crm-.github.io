package cn.zyd.po;
//����������JavaBean����Ӧ���ݿ�����ı������ڷ�װǰ̨�м���Ҫ��ѯ���ܵķ�װ
public class QuerryVo {

		//�ͻ�����
		private String custName;
		private String custSource;
		private String custIndustry;
		private String custLevel;
		//��ǰҳ
		private Integer page;
		//ÿҳ��
		private Integer size = 10; 
		//��ʼ��
		private Integer startRow = 0;
		public String getCustName() {
			return custName;
		}
		public void setCustName(String custName) {
			this.custName = custName;
		}
		public String getCustSource() {
			return custSource;
		}
		public void setCustSource(String custSource) {
			this.custSource = custSource;
		}
		public String getCustIndustry() {
			return custIndustry;
		}
		public void setCustIndustry(String custIndustry) {
			this.custIndustry = custIndustry;
		}
		public String getCustLevel() {
			return custLevel;
		}
		public void setCustLevel(String custLevel) {
			this.custLevel = custLevel;
		}
		public Integer getPage() {
			return page;
		}
		public void setPage(Integer page) {
			this.page = page;
		}
		public Integer getSize() {
			return size;
		}
		public void setSize(Integer size) {
			this.size = size;
		}
		public Integer getStartRow() {
			return startRow;
		}
		public void setStartRow(Integer startRow) {
			this.startRow = startRow;
		}
	
}