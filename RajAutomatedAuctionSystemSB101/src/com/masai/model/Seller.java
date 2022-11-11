package com.masai.model;

public class Seller {
	 int sellid ;
	   String  productname;
	    String productcat;
	    int qn;
	    int price;
	    int rid;
		public int getSellid() {
			return sellid;
		}
		public void setSellid(int sellid) {
			this.sellid = sellid;
		}
		public String getProductname() {
			return productname;
		}
		public void setProductname(String productname) {
			this.productname = productname;
		}
		public String getProductcat() {
			return productcat;
		}
		public void setProductcat(String productcat) {
			this.productcat = productcat;
		}
		public int getQn() {
			return qn;
		}
		public void setQn(int qn) {
			this.qn = qn;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public int getRid() {
			return rid;
		}
		public void setRid(int rid) {
			this.rid = rid;
		}
		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("Seller [sellid=");
			builder.append(sellid);
			builder.append(", productname=");
			builder.append(productname);
			builder.append(", productcat=");
			builder.append(productcat);
			builder.append(", qn=");
			builder.append(qn);
			builder.append(", price=");
			builder.append(price);
			builder.append(", rid=");
			builder.append(rid);
			builder.append("]");
			return builder.toString();
		}
		public Seller(int sellid, String productname, String productcat, int qn, int price, int rid) {
			super();
			this.sellid = sellid;
			this.productname = productname;
			this.productcat = productcat;
			this.qn = qn;
			this.price = price;
			this.rid = rid;
		}
	    
}
