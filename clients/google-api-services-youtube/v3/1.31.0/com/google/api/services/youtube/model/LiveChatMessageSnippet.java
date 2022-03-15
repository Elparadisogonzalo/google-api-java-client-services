/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.youtube.model;

/**
 * Next ID: 33
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the YouTube Data API v3. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class LiveChatMessageSnippet extends com.google.api.client.json.GenericJson {

  /**
   * The ID of the user that authored this message, this field is not always filled.
   * textMessageEvent - the user that wrote the message fanFundingEvent - the user that funded the
   * broadcast newSponsorEvent - the user that just became a sponsor memberMilestoneChatEvent - the
   * member that sent the message membershipGiftingEvent - the user that made the purchase
   * giftMembershipReceivedEvent - the user that received the gift membership messageDeletedEvent -
   * the moderator that took the action messageRetractedEvent - the author that retracted their
   * message userBannedEvent - the moderator that took the action superChatEvent - the user that
   * made the purchase superStickerEvent - the user that made the purchase
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String authorChannelId;

  /**
   * Contains a string that can be displayed to the user. If this field is not present the message
   * is silent, at the moment only messages of type TOMBSTONE and CHAT_ENDED_EVENT are silent.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayMessage;

  /**
   * Details about the funding event, this is only set if the type is 'fanFundingEvent'.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private LiveChatFanFundingEventDetails fanFundingEventDetails;

  /**
   * Details about the Gift Membership Received event, this is only set if the type is
   * 'giftMembershipReceivedEvent'.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private LiveChatGiftMembershipReceivedDetails giftMembershipReceivedDetails;

  /**
   * Whether the message has display content that should be displayed to users.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean hasDisplayContent;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String liveChatId;

  /**
   * Details about the Member Milestone Chat event, this is only set if the type is
   * 'memberMilestoneChatEvent'.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private LiveChatMemberMilestoneChatDetails memberMilestoneChatDetails;

  /**
   * Details about the Membership Gifting event, this is only set if the type is
   * 'membershipGiftingEvent'.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private LiveChatMembershipGiftingDetails membershipGiftingDetails;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private LiveChatMessageDeletedDetails messageDeletedDetails;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private LiveChatMessageRetractedDetails messageRetractedDetails;

  /**
   * Details about the New Member Announcement event, this is only set if the type is
   * 'newSponsorEvent'. Please note that "member" is the new term for "sponsor".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private LiveChatNewSponsorDetails newSponsorDetails;

  /**
   * The date and time when the message was orignally published.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private com.google.api.client.util.DateTime publishedAt;

  /**
   * Details about the Super Chat event, this is only set if the type is 'superChatEvent'.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private LiveChatSuperChatDetails superChatDetails;

  /**
   * Details about the Super Sticker event, this is only set if the type is 'superStickerEvent'.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private LiveChatSuperStickerDetails superStickerDetails;

  /**
   * Details about the text message, this is only set if the type is 'textMessageEvent'.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private LiveChatTextMessageDetails textMessageDetails;

  /**
   * The type of message, this will always be present, it determines the contents of the message as
   * well as which fields will be present.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private LiveChatUserBannedMessageDetails userBannedDetails;

  /**
   * The ID of the user that authored this message, this field is not always filled.
   * textMessageEvent - the user that wrote the message fanFundingEvent - the user that funded the
   * broadcast newSponsorEvent - the user that just became a sponsor memberMilestoneChatEvent - the
   * member that sent the message membershipGiftingEvent - the user that made the purchase
   * giftMembershipReceivedEvent - the user that received the gift membership messageDeletedEvent -
   * the moderator that took the action messageRetractedEvent - the author that retracted their
   * message userBannedEvent - the moderator that took the action superChatEvent - the user that
   * made the purchase superStickerEvent - the user that made the purchase
   * @return value or {@code null} for none
   */
  public java.lang.String getAuthorChannelId() {
    return authorChannelId;
  }

  /**
   * The ID of the user that authored this message, this field is not always filled.
   * textMessageEvent - the user that wrote the message fanFundingEvent - the user that funded the
   * broadcast newSponsorEvent - the user that just became a sponsor memberMilestoneChatEvent - the
   * member that sent the message membershipGiftingEvent - the user that made the purchase
   * giftMembershipReceivedEvent - the user that received the gift membership messageDeletedEvent -
   * the moderator that took the action messageRetractedEvent - the author that retracted their
   * message userBannedEvent - the moderator that took the action superChatEvent - the user that
   * made the purchase superStickerEvent - the user that made the purchase
   * @param authorChannelId authorChannelId or {@code null} for none
   */
  public LiveChatMessageSnippet setAuthorChannelId(java.lang.String authorChannelId) {
    this.authorChannelId = authorChannelId;
    return this;
  }

  /**
   * Contains a string that can be displayed to the user. If this field is not present the message
   * is silent, at the moment only messages of type TOMBSTONE and CHAT_ENDED_EVENT are silent.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayMessage() {
    return displayMessage;
  }

  /**
   * Contains a string that can be displayed to the user. If this field is not present the message
   * is silent, at the moment only messages of type TOMBSTONE and CHAT_ENDED_EVENT are silent.
   * @param displayMessage displayMessage or {@code null} for none
   */
  public LiveChatMessageSnippet setDisplayMessage(java.lang.String displayMessage) {
    this.displayMessage = displayMessage;
    return this;
  }

  /**
   * Details about the funding event, this is only set if the type is 'fanFundingEvent'.
   * @return value or {@code null} for none
   */
  public LiveChatFanFundingEventDetails getFanFundingEventDetails() {
    return fanFundingEventDetails;
  }

  /**
   * Details about the funding event, this is only set if the type is 'fanFundingEvent'.
   * @param fanFundingEventDetails fanFundingEventDetails or {@code null} for none
   */
  public LiveChatMessageSnippet setFanFundingEventDetails(LiveChatFanFundingEventDetails fanFundingEventDetails) {
    this.fanFundingEventDetails = fanFundingEventDetails;
    return this;
  }

  /**
   * Details about the Gift Membership Received event, this is only set if the type is
   * 'giftMembershipReceivedEvent'.
   * @return value or {@code null} for none
   */
  public LiveChatGiftMembershipReceivedDetails getGiftMembershipReceivedDetails() {
    return giftMembershipReceivedDetails;
  }

  /**
   * Details about the Gift Membership Received event, this is only set if the type is
   * 'giftMembershipReceivedEvent'.
   * @param giftMembershipReceivedDetails giftMembershipReceivedDetails or {@code null} for none
   */
  public LiveChatMessageSnippet setGiftMembershipReceivedDetails(LiveChatGiftMembershipReceivedDetails giftMembershipReceivedDetails) {
    this.giftMembershipReceivedDetails = giftMembershipReceivedDetails;
    return this;
  }

  /**
   * Whether the message has display content that should be displayed to users.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getHasDisplayContent() {
    return hasDisplayContent;
  }

  /**
   * Whether the message has display content that should be displayed to users.
   * @param hasDisplayContent hasDisplayContent or {@code null} for none
   */
  public LiveChatMessageSnippet setHasDisplayContent(java.lang.Boolean hasDisplayContent) {
    this.hasDisplayContent = hasDisplayContent;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getLiveChatId() {
    return liveChatId;
  }

  /**
   * @param liveChatId liveChatId or {@code null} for none
   */
  public LiveChatMessageSnippet setLiveChatId(java.lang.String liveChatId) {
    this.liveChatId = liveChatId;
    return this;
  }

  /**
   * Details about the Member Milestone Chat event, this is only set if the type is
   * 'memberMilestoneChatEvent'.
   * @return value or {@code null} for none
   */
  public LiveChatMemberMilestoneChatDetails getMemberMilestoneChatDetails() {
    return memberMilestoneChatDetails;
  }

  /**
   * Details about the Member Milestone Chat event, this is only set if the type is
   * 'memberMilestoneChatEvent'.
   * @param memberMilestoneChatDetails memberMilestoneChatDetails or {@code null} for none
   */
  public LiveChatMessageSnippet setMemberMilestoneChatDetails(LiveChatMemberMilestoneChatDetails memberMilestoneChatDetails) {
    this.memberMilestoneChatDetails = memberMilestoneChatDetails;
    return this;
  }

  /**
   * Details about the Membership Gifting event, this is only set if the type is
   * 'membershipGiftingEvent'.
   * @return value or {@code null} for none
   */
  public LiveChatMembershipGiftingDetails getMembershipGiftingDetails() {
    return membershipGiftingDetails;
  }

  /**
   * Details about the Membership Gifting event, this is only set if the type is
   * 'membershipGiftingEvent'.
   * @param membershipGiftingDetails membershipGiftingDetails or {@code null} for none
   */
  public LiveChatMessageSnippet setMembershipGiftingDetails(LiveChatMembershipGiftingDetails membershipGiftingDetails) {
    this.membershipGiftingDetails = membershipGiftingDetails;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public LiveChatMessageDeletedDetails getMessageDeletedDetails() {
    return messageDeletedDetails;
  }

  /**
   * @param messageDeletedDetails messageDeletedDetails or {@code null} for none
   */
  public LiveChatMessageSnippet setMessageDeletedDetails(LiveChatMessageDeletedDetails messageDeletedDetails) {
    this.messageDeletedDetails = messageDeletedDetails;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public LiveChatMessageRetractedDetails getMessageRetractedDetails() {
    return messageRetractedDetails;
  }

  /**
   * @param messageRetractedDetails messageRetractedDetails or {@code null} for none
   */
  public LiveChatMessageSnippet setMessageRetractedDetails(LiveChatMessageRetractedDetails messageRetractedDetails) {
    this.messageRetractedDetails = messageRetractedDetails;
    return this;
  }

  /**
   * Details about the New Member Announcement event, this is only set if the type is
   * 'newSponsorEvent'. Please note that "member" is the new term for "sponsor".
   * @return value or {@code null} for none
   */
  public LiveChatNewSponsorDetails getNewSponsorDetails() {
    return newSponsorDetails;
  }

  /**
   * Details about the New Member Announcement event, this is only set if the type is
   * 'newSponsorEvent'. Please note that "member" is the new term for "sponsor".
   * @param newSponsorDetails newSponsorDetails or {@code null} for none
   */
  public LiveChatMessageSnippet setNewSponsorDetails(LiveChatNewSponsorDetails newSponsorDetails) {
    this.newSponsorDetails = newSponsorDetails;
    return this;
  }

  /**
   * The date and time when the message was orignally published.
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getPublishedAt() {
    return publishedAt;
  }

  /**
   * The date and time when the message was orignally published.
   * @param publishedAt publishedAt or {@code null} for none
   */
  public LiveChatMessageSnippet setPublishedAt(com.google.api.client.util.DateTime publishedAt) {
    this.publishedAt = publishedAt;
    return this;
  }

  /**
   * Details about the Super Chat event, this is only set if the type is 'superChatEvent'.
   * @return value or {@code null} for none
   */
  public LiveChatSuperChatDetails getSuperChatDetails() {
    return superChatDetails;
  }

  /**
   * Details about the Super Chat event, this is only set if the type is 'superChatEvent'.
   * @param superChatDetails superChatDetails or {@code null} for none
   */
  public LiveChatMessageSnippet setSuperChatDetails(LiveChatSuperChatDetails superChatDetails) {
    this.superChatDetails = superChatDetails;
    return this;
  }

  /**
   * Details about the Super Sticker event, this is only set if the type is 'superStickerEvent'.
   * @return value or {@code null} for none
   */
  public LiveChatSuperStickerDetails getSuperStickerDetails() {
    return superStickerDetails;
  }

  /**
   * Details about the Super Sticker event, this is only set if the type is 'superStickerEvent'.
   * @param superStickerDetails superStickerDetails or {@code null} for none
   */
  public LiveChatMessageSnippet setSuperStickerDetails(LiveChatSuperStickerDetails superStickerDetails) {
    this.superStickerDetails = superStickerDetails;
    return this;
  }

  /**
   * Details about the text message, this is only set if the type is 'textMessageEvent'.
   * @return value or {@code null} for none
   */
  public LiveChatTextMessageDetails getTextMessageDetails() {
    return textMessageDetails;
  }

  /**
   * Details about the text message, this is only set if the type is 'textMessageEvent'.
   * @param textMessageDetails textMessageDetails or {@code null} for none
   */
  public LiveChatMessageSnippet setTextMessageDetails(LiveChatTextMessageDetails textMessageDetails) {
    this.textMessageDetails = textMessageDetails;
    return this;
  }

  /**
   * The type of message, this will always be present, it determines the contents of the message as
   * well as which fields will be present.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * The type of message, this will always be present, it determines the contents of the message as
   * well as which fields will be present.
   * @param type type or {@code null} for none
   */
  public LiveChatMessageSnippet setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public LiveChatUserBannedMessageDetails getUserBannedDetails() {
    return userBannedDetails;
  }

  /**
   * @param userBannedDetails userBannedDetails or {@code null} for none
   */
  public LiveChatMessageSnippet setUserBannedDetails(LiveChatUserBannedMessageDetails userBannedDetails) {
    this.userBannedDetails = userBannedDetails;
    return this;
  }

  @Override
  public LiveChatMessageSnippet set(String fieldName, Object value) {
    return (LiveChatMessageSnippet) super.set(fieldName, value);
  }

  @Override
  public LiveChatMessageSnippet clone() {
    return (LiveChatMessageSnippet) super.clone();
  }

}
