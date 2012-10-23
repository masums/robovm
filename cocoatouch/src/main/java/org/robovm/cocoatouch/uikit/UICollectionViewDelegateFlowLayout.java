/*
 * Copyright (C) 2012 RoboVM
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.cocoatouch.uikit;

/*<imports>*/
import org.robovm.cocoatouch.coreanimation.*;
import org.robovm.cocoatouch.coredata.*;
import org.robovm.cocoatouch.coregraphics.*;
import org.robovm.cocoatouch.coreimage.*;
import org.robovm.cocoatouch.foundation.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.block.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
/*</imports>*/

/**
 *
 * <div class="javadoc">
 *   @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UICollectionViewDelegateFlowLayout_protocol/Reference/Reference.html">UICollectionViewDelegateFlowLayout Protocol Reference</a>
 *   @since Available in iOS 6.0 and later.
 * </div>
 */
public interface /*<name>*/ UICollectionViewDelegateFlowLayout /*</name>*/ /*<implements>*/ extends UICollectionViewDelegate, ObjCProtocol /*</implements>*/ {

    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UICollectionViewDelegateFlowLayout_protocol/Reference/Reference.html#//apple_ref/occ/intfm/UICollectionViewDelegateFlowLayout/collectionView:layout:sizeForItemAtIndexPath:">- (CGSize)collectionView:(UICollectionView *)collectionView layout:(UICollectionViewLayout*)collectionViewLayout sizeForItemAtIndexPath:(NSIndexPath *)indexPath</a>
     * @since Available in iOS 6.0 and later.
     */
    CGSize getItemSize(UICollectionView collectionView, UICollectionViewLayout collectionViewLayout, NSIndexPath indexPath);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UICollectionViewDelegateFlowLayout_protocol/Reference/Reference.html#//apple_ref/occ/intfm/UICollectionViewDelegateFlowLayout/collectionView:layout:referenceSizeForFooterInSection:">- (CGSize)collectionView:(UICollectionView *)collectionView layout:(UICollectionViewLayout*)collectionViewLayout referenceSizeForFooterInSection:(NSInteger)section</a>
     * @since Available in iOS 6.0 and later.
     */
    CGSize getSectionFooterReferenceSize(UICollectionView collectionView, UICollectionViewLayout collectionViewLayout, int section);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UICollectionViewDelegateFlowLayout_protocol/Reference/Reference.html#//apple_ref/occ/intfm/UICollectionViewDelegateFlowLayout/collectionView:layout:referenceSizeForHeaderInSection:">- (CGSize)collectionView:(UICollectionView *)collectionView layout:(UICollectionViewLayout*)collectionViewLayout referenceSizeForHeaderInSection:(NSInteger)section</a>
     * @since Available in iOS 6.0 and later.
     */
    CGSize getSectionHeaderReferenceSize(UICollectionView collectionView, UICollectionViewLayout collectionViewLayout, int section);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UICollectionViewDelegateFlowLayout_protocol/Reference/Reference.html#//apple_ref/occ/intfm/UICollectionViewDelegateFlowLayout/collectionView:layout:insetForSectionAtIndex:">- (UIEdgeInsets)collectionView:(UICollectionView *)collectionView layout:(UICollectionViewLayout*)collectionViewLayout insetForSectionAtIndex:(NSInteger)section</a>
     * @since Available in iOS 6.0 and later.
     */
    UIEdgeInsets getSectionInset(UICollectionView collectionView, UICollectionViewLayout collectionViewLayout, int section);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UICollectionViewDelegateFlowLayout_protocol/Reference/Reference.html#//apple_ref/occ/intfm/UICollectionViewDelegateFlowLayout/collectionView:layout:minimumInteritemSpacingForSectionAtIndex:">- (CGFloat)collectionView:(UICollectionView *)collectionView layout:(UICollectionViewLayout*)collectionViewLayout minimumInteritemSpacingForSectionAtIndex:(NSInteger)section</a>
     * @since Available in iOS 6.0 and later.
     */
    float getSectionMinimumInteritemSpacing(UICollectionView collectionView, UICollectionViewLayout collectionViewLayout, int section);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UICollectionViewDelegateFlowLayout_protocol/Reference/Reference.html#//apple_ref/occ/intfm/UICollectionViewDelegateFlowLayout/collectionView:layout:minimumLineSpacingForSectionAtIndex:">- (CGFloat)collectionView:(UICollectionView *)collectionView layout:(UICollectionViewLayout*)collectionViewLayout minimumLineSpacingForSectionAtIndex:(NSInteger)section</a>
     * @since Available in iOS 6.0 and later.
     */
    float getSectionMinimumLineSpacing(UICollectionView collectionView, UICollectionViewLayout collectionViewLayout, int section);
    /*</methods>*/

}
