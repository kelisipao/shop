package tianjin.wuqing.land.service;

import java.io.File;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import tianjin.wuqing.interfaces.LandTransferDAOInterface;
import tianjin.wuqing.interfaces.LandTransferSupplyServiceInterface;
import tianjin.wuqing.po.LandTransferSupply;
import tianjin.wuqing.utils.FileToSave;

@Service("landTransferService")
public class LandTransferService2 implements LandTransferSupplyServiceInterface {
	@Resource(name = "landTransferDAO")
	private LandTransferDAOInterface landDAO;

	/**
	 * addLand(..)����������ɹ���������Ϣ����Ӻ��ļ����ϴ��������ع����ύ���ϴ�������������Ϣ
	 * 
	 * @param land
	 *            ����洢��������Ϣ
	 * @param upload
	 *            �����ļ��ϴ��Ĵ洢Ŀ¼
	 * @param agenetFile
	 *            �����ϴ��Ĵ�����֤���ļ�
	 * @param agentFileFileName
	 *            �����ϴ��Ĵ�����֤���ļ���
	 * @param sceneFile
	 *            �����ϴ��������ֳ���Ƭ
	 * @param sceneFileFileName
	 *            �����ϴ��������ֳ���Ƭ��
	 * @param sourceProofFile
	 *            �����ϴ���������Դ֤���ļ�
	 * @param sourceProofFileFileName
	 *            �����ϴ���������Դ֤���ļ���
	 * @param idProofFile
	 *            ��������ʹ��Ȩ�����֤��
	 * @param idProofFileFileName
	 *            ��������ʹ��Ȩ�����֤���ļ���
	 * @param agreeTransferFile
	 *            Ȩ����ͬ��ת������֤��
	 * @param agreeTransferFileFileName
	 *            Ȩ����ͬ��ת������֤���ļ���
	 * @param otherFiles
	 *            ������ز����ļ�
	 * @param otherFilesFileName
	 *            ������ز����ļ���
	 * @return List<LandTransferSupply> ��ʾ��ǰ���ع����ύ�˵��ϴ�������������Ϣ
	 * 
	 *         ������Ҫ��������ĸ������� ��1������upload�������ϴ��ļ���
	 *         ��2�������Ĵ�updateFileToDir(..)�������ֱ����agenetFile
	 *         ��sceneFile��sourceProofFile
	 *         ��idProofFile��agreeTransferFile��otherFiles���ϴ�����
	 *         ��3���ϴ��ɹ��󣬽��ϴ��ļ��ĵ�ַ�洢��land�����У�֮�󣬽�land��״̬�޸�Ϊ����飨0ֵ��Ҳ��Ĭ��ֵ��
	 *         ��4����land���󴫵ݸ�DAO����������ݿ�Ĵ洢
	 *         ��5���洢�ɹ�������DAO�еķ�������land�е�supplierIdΪ��������ѯ�ύ�����е�������Ϣ������List
	 */
	public boolean addLand(LandTransferSupply land, String upload,
			List<File> allFiles, List<String> allFilesFileName) {
		String millis = System.currentTimeMillis() + "";
		String s = upload + "/" + millis;
		File dir = new File(s);
		dir.mkdir();
		boolean flag = FileToSave.updateFileToDir(dir, allFiles,
				allFilesFileName);
		allFilesFileName = FileToSave.getDir(allFilesFileName, "upload/"
				+ millis);
		if (flag) {
			try {
				land.setAllFilePics(allFilesFileName);
				landDAO.insertLand(land);
				/*
				 * List<LandTransferSupply> result = landDAO
				 * .querySupplyByHQLAndArgs(
				 * "from LandTransferSupply as land where land.supplierId = ?",
				 * new Object[] { land.getSupplierId() });
				 */
				return true;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return false;
	}

	private int changeStatus(int status, int oper) {
		if (oper == 0) {
			status++;
		} else {
			status--;
		}
		return status;
	}

	/**
	 * confirmContract(..)�������ڽ�land״̬��Ϊ��ͬȷ��
	 * 
	 * @param land
	 *            ������޸�״̬��������Ϣ
	 * @return List<LandTransferSupply> �����������������ڽ��н��׵�������Ϣ ��Ҫ����������
	 *         ��1�����land�е�״ֵ̬������changeStatus()������ʹ״̬��1 ��2������DAO�������land����
	 *         ��3������land��demanderId��ֵ��status=6Ϊ��������ѯ����������������ڽ��еĽ���
	 */
	
}
