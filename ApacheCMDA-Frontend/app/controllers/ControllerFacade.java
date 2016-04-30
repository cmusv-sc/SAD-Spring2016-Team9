package controllers;

import models.Group;
import models.Workflow;
import models.metadata.ClimateService;
import play.mvc.*;

import java.io.UnsupportedEncodingException;
import java.util.List;

/**
 * Facade design pattern of all controllers
 * @author Qiaoyi Chen (qiaoyic)
 */
public class ControllerFacade extends Controller {

	// AboutusController

	public static Result aboutusAboutUs() {
		return AboutusController.aboutUs();
	}

	public static Result aboutusAboutProject() {
		return AboutusController.aboutProject();
	}

	// BugReportController

	public static Result bugReportReports() {
		return BugReportController.reports();
	}

	public static Result bugReportNewReport() {
		return BugReportController.newReport();
	}

	public static Result bugReportList() {
		return BugReportController.list();
	}

	public static Result bugReportDeleteReport() {
		return BugReportController.deleteReport();
	}

	public static Result bugReportSolveReport() {
		return BugReportController.solveReport();
	}

	// ClimateServiceController

	public static Result climateServiceHome(String email, String vfile, String dataset) {
		return ClimateServiceController.home(email, vfile, dataset);
	}

	public static Result climateServiceAddClimateServices() {
		return ClimateServiceController.addClimateServices();
	}

	public static Result climateServiceTutorial() {
		return ClimateServiceController.tutorial();
	}

	public static Result climateServiceClimateServices() {
		return ClimateServiceController.climateServices();
	}

	public static Result climateServiceMostRecentlyAddedClimateServices() {
		return ClimateServiceController.mostRecentlyAddedClimateServices();
	}

	public static Result climateServiceMostRecentlyUsedClimateServices() {
		return ClimateServiceController.mostRecentlyUsedClimateServices();
	}

	public static Result ResultclimateServiceMostPopularClimateServices() {
		return ClimateServiceController.mostPopularClimateServices();
	}

	public static Result climateServiceNewClimateService() {
		return ClimateServiceController.newClimateService();
	}

	public static Result climateServiceEditClimateService() {
		return ClimateServiceController.editClimateService();
	}

	public static Result climateServiceDeleteClimateService() throws UnsupportedEncodingException {
		return ClimateServiceController.deleteClimateService();
	}

	public static Result climateServiceDownloadClimateService() {
		return ClimateServiceController.downloadClimateService();
	}

	public static Result climateServiceOneService(String url) {
		return ClimateServiceController.oneService(url);
	}

	// DatasetController

	public static Result datasetDatasetList() {
		return DatasetController.datasetList();
	}

	public static Result datasetSearchDataset() {
		return DatasetController.searchDataset();
	}

	public static Result datasetGetSearchResult() {
		return DatasetController.getSearchResult();
	}

	// GroupController

	public static Result groupCreate() {
		return GroupController.create();
	}

	public static Result groupJoin() {
		return GroupController.join();
	}

	public static Result groupCreateGroup() {
		return GroupController.createGroup();
	}

	public static Result groupJoinGroup() {
		return GroupController.joinGroup();
	}

	// NotificationController

	public static Result notificationMain() {
		return NotificationController.main();
	}

	public static Result notificationAcceptFriend(Long id) {
		return NotificationController.accpetFriend(id);
	}

	public static Result notificationRejectFriend(Long id) {
		return NotificationController.rejectFriend(id);
	}

	public static Result notificationSendMessage() {
		return NotificationController.sendMessage();
	}

	public static Result notificationPmDetailPage(Long id) {
		return NotificationController.pmdetailpage(id);
	}

	public static List<Workflow> notificationGetTop3Workflow() {
		return NotificationController.getTop3Workflow();
	}

	public static Result notificationGetNotifications() {
		return NotificationController.getNotifications();
	}

	// ProfileController

	public static boolean profileNotPass() {
		return ProfileController.notpass();
	}

	public static Result ProfileProfile(Long id) {
		return ProfileController.profile(id);
	}

	public static List<Workflow> profileGetMyWorkflows(Long id) {
		return ProfileController.getMyWorkflows(id);
	}

	public static Result profileSendRequest(Long id) {
		return ProfileController.sendRequest(id);
	}

	public static Result profileDeleteFriend(Long id) {
		return ProfileController.deleteFriend(id);
	}

	public static Result profileFollow(Long id) {
		return ProfileController.follow(id);
	}

	public static Result profileUnfollow(Long id) {
		return ProfileController.unfollow(id);
	}

	// SearchController

	public static boolean searchNotPass() {
		return SearchController.notpass();
	}

	public static Result searchIndex() {
		return SearchController.index();
	}

	public static Result searchSearch(String category, String keywd) {
		return SearchController.search(category, keywd);
	}

	// SignupController

	public static Result signupSignUp() {
		return SignupController.signUp();
	}

	public static Result signupRegister() {
		return SignupController.register();
	}

	// TimelineController

	public static boolean timelineNotPass() {
		return TimelineController.notpass();
	}

	public static Result timelineMain(long offset) {
		return TimelineController.main(offset);
	}

	public static List<Workflow> timelineGetWorkflows(long offset) {
		return TimelineController.getWorkflows(offset);
	}

	// WorkflowController

	public static boolean workflowNotPass() {
		return WorkflowController.notpass();
	}

	public static Result workflowMain() {
		return WorkflowController.main();
	}

	public static Result workflowAddComment(Long wid) {
		return WorkflowController.addComment(wid);
	}

	public static Result workflowAddReply(long toUserId, long commentId, long wid) {
		return WorkflowController.addReply(toUserId, commentId, wid);
	}

	public static Result workflowThumbUp(Long commentId, Long wid) {
		return WorkflowController.thumbUp(commentId, wid);
	}

	public static Result workflowThumbDown(Long commentId, Long wid) {
		return WorkflowController.thumbDown(commentId, wid);
	}

	public static Result workflowDeleteWorkflow(Long wid) {
		return WorkflowController.deleteWorkflow(wid);
	}

	public static Result workflowWorkflowDetail(Long wid) {
		return WorkflowController.workflowDetail(wid);
	}

	public static Result workflowEdit(Long wid) {
		return WorkflowController.edit(wid);
	}

	public static Result workflowAddTag(Long wid, String tag) {
		return WorkflowController.addTag(wid, tag);
	}

	public static Result workflowDeleteTag(Long wid, String tag) {
		return WorkflowController.deleteTag(wid, tag);
	}

	public static Result workflowEditFlow(Long wid) {
		return WorkflowController.editFlow(wid);
	}

	public static Result workflowCreateFlow() {
		return WorkflowController.createFlow();
	}

	public static Result workflowGetPublicWorkflow() {
		return WorkflowController.getPublicWorkflow();
	}

	public static Result workflowAddSuggestion(Long wid) {
		return WorkflowController.addSuggestion(wid);
	}

	public static Result workflowAddSuggestionTag(Long suggestionID) {
		return WorkflowController.addSuggestionTag(suggestionID);
	}

	public static Result workflowVoteToSuggestion(Long suggestionID) {
		return WorkflowController.voteToSuggestion(suggestionID);
	}

	public static Result workflowParseXML(Long id) {
		return WorkflowController.parseXML(id);
	}

}
