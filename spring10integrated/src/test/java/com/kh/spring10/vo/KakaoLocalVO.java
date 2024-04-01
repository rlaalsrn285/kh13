package com.kh.spring10.vo;

public class KakaoLocalVO {
	private KakaoLocalDocumentVO[] documents;
	private KakaoLocalMetaVO meta;
	public KakaoLocalDocumentVO[] getDocuments() {
		return documents;
	}
	public void setDocuments(KakaoLocalDocumentVO[] documents) {
		this.documents = documents;
	}
	public KakaoLocalMetaVO getMeta() {
		return meta;
	}
	public void setMeta(KakaoLocalMetaVO meta) {
		this.meta = meta;
	}
}
