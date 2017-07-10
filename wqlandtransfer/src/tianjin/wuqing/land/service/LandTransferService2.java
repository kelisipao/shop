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
	 * addLand(..)方法用于完成供给土地信息的添加和文件的上传，并返回供给提交人上传的所有土地信息
	 * 
	 * @param land
	 *            代表存储的土地信息
	 * @param upload
	 *            代表文件上传的存储目录
	 * @param agenetFile
	 *            代表上传的代理人证明文件
	 * @param agentFileFileName
	 *            代表上传的代理人证明文件名
	 * @param sceneFile
	 *            代表上传的土地现场照片
	 * @param sceneFileFileName
	 *            代表上传的土地现场照片名
	 * @param sourceProofFile
	 *            代表上传的土地来源证明文件
	 * @param sourceProofFileFileName
	 *            代表上传的土地来源证明文件名
	 * @param idProofFile
	 *            代表土地使用权人身份证明
	 * @param idProofFileFileName
	 *            代表土地使用权人身份证明文件名
	 * @param agreeTransferFile
	 *            权利人同意转让书面证明
	 * @param agreeTransferFileFileName
	 *            权利人同意转让书面证明文件名
	 * @param otherFiles
	 *            其它相关材料文件
	 * @param otherFilesFileName
	 *            其它相关材料文件名
	 * @return List<LandTransferSupply> 表示当前土地供给提交人的上传的所有土地信息
	 * 
	 *         方法需要完成以下四个操作： （1）根据upload，创建上传文件夹
	 *         （2）调用四次updateFileToDir(..)方法，分别完成agenetFile
	 *         、sceneFile、sourceProofFile
	 *         、idProofFile、agreeTransferFile和otherFiles的上传操作
	 *         （3）上传成功后，将上传文件的地址存储在land对象中，之后，将land的状态修改为待检查（0值，也是默认值）
	 *         （4）将land对象传递给DAO，完成向数据库的存储
	 *         （5）存储成功后，利用DAO中的方法，以land中的supplierId为条件，查询提交人所有的土地信息并返回List
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
	 * confirmContract(..)方法用于将land状态改为合同确认
	 * 
	 * @param land
	 *            代表待修改状态的土地信息
	 * @return List<LandTransferSupply> 返回需求者所有正在进行交易的土地信息 需要三个操作：
	 *         （1）获得land中的状态值，调用changeStatus()方法，使状态加1 （2）利用DAO对象更新land对象
	 *         （3）利用land中demanderId的值和status=6为条件，查询获得需求者所有正在进行的交易
	 */
	
}
