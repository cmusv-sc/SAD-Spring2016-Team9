package controllers;

import play.mvc.*;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import javax.persistence.PersistenceException;
import org.apache.commons.lang3.StringEscapeUtils;
import com.fasterxml.jackson.databind.JsonNode;

/**
 * Facade design pattern of all controllers
 * @author Qiaoyi Chen (qiaoyic)
 */

public class ControllerFacade extends Controller {

	private ClimateServiceController climateServiceController;
	private CommentController commentController;
	private DatasetController datasetController;
	private DatasetLogController datasetLogController;
	private GroupUsersController groupUsersController;
	private InstrumentController instrumentController;
	private MailController mailController;
	private ParameterController parameterController;
	private SuggestionsController suggestionsController;
	private TagController tagController;
	private UserController userController;
	private WorkflowController workflowController;

	public ControllerFacade(IController controller) {
		if (controller instanceof ClimateServiceController) {
			climateServiceController = (ClimateServiceController) controller;
		} else if (controller instanceof CommentController) {
			commentController = (CommentController) controller;
		} else if (controller instanceof DatasetController) {
			datasetController = (DatasetController) controller;
		} else if (controller instanceof DatasetLogController) {
			datasetLogController = (DatasetLogController) controller;
		} else if (controller instanceof GroupUsersController) {
			groupUsersController = (GroupUsersController) controller;
		} else if (controller instanceof InstrumentController) {
			instrumentController = (InstrumentController) controller;
		} else if (controller instanceof MailController) {
			mailController = (MailController) controller;
		} else if (controller instanceof ParameterController) {
			parameterController = (ParameterController) controller;
		} else if (controller instanceof SuggestionsController) {
			suggestionsController = (SuggestionsController) controller;
		} else if (controller instanceof TagController) {
			tagController = (TagController) controller;
		} else if (controller instanceof UserController) {
			userController = (UserController) controller;
		} else if (controller instanceof WorkflowController) {
			workflowController = (WorkflowController) controller;
		}
	}

	// ClimateServiceController

	public Result climateAddClimateService() {
		return climateServiceController.addClimateService();
	}

	public Result climateSavePage() {
		return climateServiceController.savePage();
	}

	public Result climateDeleteClimateServiceById(long id) {
		return climateServiceController.deleteClimateServiceById(id);
	}

	public Result climateDeleteClimateServiceByName(String name) {
		return climateServiceController.deleteClimateServiceByName(name);
	}

	public Result climateUpdateClimateServiceById(long id) {
		return climateServiceController.updateClimateServiceById(id);
	}

	public Result climateUpdateClimateServiceByName(String oldName) {
		return climateServiceController.updateClimateServiceByName(oldName);
	}

	public Result climateGetClimateService(String name, String format) {
		return climateServiceController.getClimateService(name, format);
	}

	public Result climateGetClimateServiceById(long id) {
		return climateServiceController.getClimateServiceById(id);
	}

	public Result climateGetAllClimateServices(String format) {
		return climateServiceController.getAllClimateServices(format);
	}

	public Result climateGetAllClimateServicesOrderByCreateTime(String format) {
		return climateServiceController.getAllClimateServicesOrderByCreateTime(format);
	}

	public Result climateGetAllClimateServicesOrderByLatestAccessTime(String format) {
		return climateServiceController.getAllClimateServicesOrderByLatestAccessTime(format);
	}

	public Result climateGetAllClimateServicesOrderByCount(String format) {
		return climateServiceController.getAllClimateServicesOrderByCount(format);
	}

	public Result climateAddServiceEntry() {
		return climateServiceController.addServiceEntry();
	}

	public Result climateGetAllServiceEntries(String format) {
		return climateServiceController.getAllServiceEntries(format);
	}

	// CommentController

	public Result commentAddReply() {
		return commentController.addReply();
	}

	public Result commentGetReply(Long commentId) {
		return commentController.getReply(commentId);
	}

	public Result commentThumbUp(Long commentId) {
		return commentController.thumbUp(commentId);
	}

	public Result commentThumbDown(Long commentId) {
		return commentController.thumbDown(commentId);
	}

	// DatasetController

	public Result datasetAddDataset() {
		return datasetController.addDataset();
	}

	public Result datasetUpdateDatasetById(long id) {
		return datasetController.updateDatasetById(id);
	}

	public Result datasetDeleteDataset(long id) {
		return datasetController.deleteDataset(id);
	}

	public Result datasetQueryDatasets() {
		return datasetController.queryDatasets();
	}

	public Result datasetGetAllDatasets(String format) {
		return datasetController.getAllDatasets(format);
	}

	// DatasetLogController

	public Result datasetLogAddDataset() {
		return datasetLogController.addDatasetLog();
	}

	public Result datasetLogUpdateDatasetLogById(long id) {
		return datasetLogController.updateDatasetLogById(id);
	}

	public Result datasetLogDeleteDatasetLog(long id) {
		return datasetLogController.deleteDatasetLog(id);
	}

	public Result datasetLogGetDatasetLog(long id, String format) {
		return datasetLogController.getDatasetLog(id, format);
	}

	public Result datasetLogGetAllDatasetLogs(String format) {
		return datasetLogController.getAllDatasetLogs(format);
	}

	// GroupUsersController

	public Result groupUsersCreateGroup() {
		return groupUsersController.createGroup();
	}

	public Result groupUsersAddMembersToGroup() {
		return groupUsersController.addMembersToGroup();
	}

	public Result groupUsersGetGroupList(Long userID, String format) {
		return groupUsersController.getGroupList(userID, format);
	}

	public Result groupUsersGetGroupMember(Long groupId, String format) {
		return groupUsersController.getGroupMember(groupId, format);
	}

	// InstrumentController
	public Result instrumentAddInstrument() {
		return instrumentController.addInstrument();
	}

	public Result instrumentUpdateInstrumentById(long id) {
		return instrumentController.updateInstrumentById(id);
	}

	public Result instrumentDeleteInstrument(long id) {
		return instrumentController.deleteInstrument(id);
	}

	public Result instrumentGetInstrument(long id, String format) {
		return instrumentController.getInstrument(id, format);
	}

	public Result instrumentGetAllInstruments(String format) {
		return instrumentController.getAllInstruments(format);
	}

	// MailController
	public Result mailSendMail() {
		return mailController.sendMail();
	}

	public Result mailReadMail(Long mailId) {
		return mailController.readMail(mailId);
	}

	public Result mailGetInbox(Long userID, String format) {
		return mailController.getInbox(userID, format);
	}

	public Result mailGetOutbox(Long userID, String format) {
		return mailController.getOutbox(userID, format);
	}

	// ParameterController

	public Result parameterAddParameter() {
		return parameterController.addParameter();
	}

	public Result parameterDeleteParameterByName(long serviceId, String name) {
		return parameterController.deleteParameterByName(serviceId, name);
	}

	public Result parameterUpdateParameterByName(String oldName) {
		return parameterController.updateParameterByName(oldName);
	}

	public Result parameterUpdateParameterById(long id) {
		return parameterController.updateParameterById(id);
	}

	public Result parameterGetParameterByName(long serviceId, String name, String format) {
		return parameterController.getParameterByName(serviceId, name, format);
	}

	public Result parameterGetParameterById(Long id, String format) {
		return parameterController.getParameterById(id, format);
	}

	public Result parameterGetAllParameters(String format) {
		return parameterController.getAllParameters(format);
	}

	// SuggestionsController

	public Result suggestionsPublishSuggestion() {
		return suggestionsController.publishSuggestion();
	}

	public Result suggestionsAddTag() {
		return suggestionsController.addTag();
	}

	public Result suggestionsVoteToSuggestion(Long suggestionID) {
		return suggestionsController.voteToSuggestion(suggestionID);
	}

	public Result suggestionsGetSuggestionForWorkflow(Long workflowId) {
		return suggestionsController.getSuggestionForWorkflow(workflowId);
	}

	// TagController

	public Result tagCreateTag() {
		return tagController.createTag();
	}

	public Result tagDeleteTag() {
		return tagController.deleteTag();
	}

	// UserController

	public Result userUserRegister() {
		return userController.userRegister();
	}

	public Result userUserLogin() {
		return userController.userLogin();
	}

	public Result userDeleteUser(Long id) {
		return userController.deleteUser(id);
	}

	public Result userSetProfile(long id) {
		return userController.setProfile(id);
	}

	public Result userGetProfile(Long id, String format) {
		return userController.getProfile(id, format);
	}

	public Result userGetAllUsers(String format) {
		return userController.getAllUsers(format);
	}

	public Result userDeleteUserByUserNameAndPassword(String userName, String password) {
		return userController.deleteUserByUserNameandPassword(userName, password);
	}

	public Result userUserSearch(String displayName, String format) {
		return userController.userSearch(displayName, format);
	}

	public Result userUserFollow(Long userId, Long followeeId) {
		return userController.userFollow(userId, followeeId);
	}

	public Result userUserUnfollow(Long userId, Long followeeId) {
		return userController.userUnfollow(userId, followeeId);
	}

	public Result userGetFollowers(Long id) {
		return userController.getFollowers(id);
	}

	public Result userGetFollowees(Long id) {
		return userController.getFollowees(id);
	}

	public Result userSendFriendRequest(Long senderId, Long receiverId) {
		return userController.sendFriendRequest(senderId, receiverId);
	}

	public Result userGetFriendRequests(Long id) {
		return userController.getFriendRequests(id);
	}

	public Result userAcceptFriendRequest(Long receiverId, Long senderId) {
		return userController.acceptFriendRequest(receiverId, senderId);
	}

	public Result userRejectFriendRequest(Long receiverId, Long senderId) {
		return userController.rejectFriendRequest(receiverId, senderId);
	}

	public Result userGetFriends(Long userId) {
		return userController.getFriends(userId);
	}

	public Result userDeleteFriend(Long userId, Long friendId) {
		return userController.deleteFriend(userId, friendId);
	}

	public Result userOkResponse(String message) {
		return userController.okResponse(message);
	}

	public Result userBadResponse(String message) {
		return userController.badResponse(message);
	}

	// WorkflowController

	public Result workflowPost() {
		return workflowController.post();
	}

	public Result workflowUpdateWorkflow() {
		return workflowController.updateWorkflow();
	}

	public Result workflowDeleteWorkflow() {
		return workflowController.deleteWorkflow();
	}

	public Result workflowUploadImage(Long id) {
		return workflowController.uploadImage(id);
	}

	public Result workflowGet(Long wfID, Long userID, String format) {
		return workflowController.get(wfID, userID, format);
	}

	public Result workflowGetWorkflowList(Long userID, String format) {
		return workflowController.getWorkflowList(userID, format);
	}

	public Result workflowGetPublicWorkflow(String format) {
		return workflowController.getPublicWorkflow(format);
	}

	public Result workflowGetTimeLine(Long id, Long offset, String format) {
		return workflowController.getTimeLine(id, offset, format);
	}

	public Result workflowAddComment() {
		return workflowController.addComment();
	}

	public Result workflowSetTag() {
		return workflowController.setTag();
	}

	public Result workflowDeleteTag(Long workflowId, String tagString) {
		return workflowController.deleteTag(workflowId, tagString);
	}

	public Result workflowGetTags(Long workflowId) {
		return workflowController.getTags(workflowId);
	}

	public Result workflowGetBytTag(String tagString) {
		return workflowController.getByTag(tagString);
	}

	public Result workflowGetByTitle(String title) {
		return workflowController.getByTitle(title);
	}

	public Result workflowGetTop3Workflow() {
		return workflowController.getTop3WorkFlow();
	}

	public Result workflowGetComments(Long workflowId) {
		return workflowController.getComments(workflowId);
	}

}
