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
 *   @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UICollectionReusableView_class/Reference/Reference.html">UICollectionReusableView Class Reference</a>
 *   @since Available in iOS 6.0 and later.
 * </div>
 */
/*<library>*/@Library("UIKit")/*</library>*/
public class /*<name>*/ UICollectionReusableView /*</name>*/ 
    extends /*<extends>*/ UIView /*</extends>*/ 
    /*<implements>*/ /*</implements>*/ {

    static {
        ObjCRuntime.bind(/*<name>*/ UICollectionReusableView /*</name>*/.class);
    }

    private static final ObjCClass objCClass = ObjCClass.getByType(/*<name>*/ UICollectionReusableView /*</name>*/.class);

    /*<constructors>*/
    protected UICollectionReusableView(SkipInit skipInit) { super(skipInit); }
    public UICollectionReusableView() {}
    
    /*</constructors>*/
    /*<properties>*/
    
    private static final Selector reuseIdentifier = Selector.register("reuseIdentifier");
    @Bridge(symbol = "objc_msgSend") private native static String objc_getReuseIdentifier(UICollectionReusableView __self__, Selector __cmd__);
    @Bridge(symbol = "objc_msgSendSuper") private native static String objc_getReuseIdentifierSuper(ObjCSuper __super__, UICollectionReusableView __self__, Selector __cmd__);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UICollectionReusableView_class/Reference/Reference.html#//apple_ref/occ/instp/UICollectionReusableView/reuseIdentifier">@property (nonatomic, readonly, copy) NSString *reuseIdentifier</a>
     * @since Available in iOS 6.0 and later.
     */
    public String getReuseIdentifier() {
        if (customClass) { return objc_getReuseIdentifierSuper(getSuper(), this, reuseIdentifier); } else { return objc_getReuseIdentifier(this, reuseIdentifier); }
    }
    /*</properties>*/
    /*<methods>*/
    
    private static final Selector applyLayoutAttributes$ = Selector.register("applyLayoutAttributes:");
    @Bridge(symbol = "objc_msgSend") private native static void objc_applyLayoutAttributes(UICollectionReusableView __self__, Selector __cmd__, UICollectionViewLayoutAttributes layoutAttributes);
    @Bridge(symbol = "objc_msgSendSuper") private native static void objc_applyLayoutAttributesSuper(ObjCSuper __super__, UICollectionReusableView __self__, Selector __cmd__, UICollectionViewLayoutAttributes layoutAttributes);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UICollectionReusableView_class/Reference/Reference.html#//apple_ref/occ/instm/UICollectionReusableView/applyLayoutAttributes:">- (void)applyLayoutAttributes:(UICollectionViewLayoutAttributes *)layoutAttributes</a>
     * @since Available in iOS 6.0 and later.
     */
    public void applyLayoutAttributes(UICollectionViewLayoutAttributes layoutAttributes) {
        if (customClass) { objc_applyLayoutAttributesSuper(getSuper(), this, applyLayoutAttributes$, layoutAttributes); } else { objc_applyLayoutAttributes(this, applyLayoutAttributes$, layoutAttributes); }
    }
    
    private static final Selector didTransitionFromLayout$toLayout$ = Selector.register("didTransitionFromLayout:toLayout:");
    @Bridge(symbol = "objc_msgSend") private native static void objc_didTransition(UICollectionReusableView __self__, Selector __cmd__, UICollectionViewLayout oldLayout, UICollectionViewLayout newLayout);
    @Bridge(symbol = "objc_msgSendSuper") private native static void objc_didTransitionSuper(ObjCSuper __super__, UICollectionReusableView __self__, Selector __cmd__, UICollectionViewLayout oldLayout, UICollectionViewLayout newLayout);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UICollectionReusableView_class/Reference/Reference.html#//apple_ref/occ/instm/UICollectionReusableView/didTransitionFromLayout:toLayout:">- (void)didTransitionFromLayout:(UICollectionViewLayout *)oldLayout toLayout:(UICollectionViewLayout *)newLayout</a>
     * @since Available in iOS 6.0 and later.
     */
    public void didTransition(UICollectionViewLayout oldLayout, UICollectionViewLayout newLayout) {
        if (customClass) { objc_didTransitionSuper(getSuper(), this, didTransitionFromLayout$toLayout$, oldLayout, newLayout); } else { objc_didTransition(this, didTransitionFromLayout$toLayout$, oldLayout, newLayout); }
    }
    
    private static final Selector prepareForReuse = Selector.register("prepareForReuse");
    @Bridge(symbol = "objc_msgSend") private native static void objc_prepareForReuse(UICollectionReusableView __self__, Selector __cmd__);
    @Bridge(symbol = "objc_msgSendSuper") private native static void objc_prepareForReuseSuper(ObjCSuper __super__, UICollectionReusableView __self__, Selector __cmd__);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UICollectionReusableView_class/Reference/Reference.html#//apple_ref/occ/instm/UICollectionReusableView/prepareForReuse">- (void)prepareForReuse</a>
     * @since Available in iOS 6.0 and later.
     */
    public void prepareForReuse() {
        if (customClass) { objc_prepareForReuseSuper(getSuper(), this, prepareForReuse); } else { objc_prepareForReuse(this, prepareForReuse); }
    }
    
    private static final Selector willTransitionFromLayout$toLayout$ = Selector.register("willTransitionFromLayout:toLayout:");
    @Bridge(symbol = "objc_msgSend") private native static void objc_willTransition(UICollectionReusableView __self__, Selector __cmd__, UICollectionViewLayout oldLayout, UICollectionViewLayout newLayout);
    @Bridge(symbol = "objc_msgSendSuper") private native static void objc_willTransitionSuper(ObjCSuper __super__, UICollectionReusableView __self__, Selector __cmd__, UICollectionViewLayout oldLayout, UICollectionViewLayout newLayout);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UICollectionReusableView_class/Reference/Reference.html#//apple_ref/occ/instm/UICollectionReusableView/willTransitionFromLayout:toLayout:">- (void)willTransitionFromLayout:(UICollectionViewLayout *)oldLayout toLayout:(UICollectionViewLayout *)newLayout</a>
     * @since Available in iOS 6.0 and later.
     */
    public void willTransition(UICollectionViewLayout oldLayout, UICollectionViewLayout newLayout) {
        if (customClass) { objc_willTransitionSuper(getSuper(), this, willTransitionFromLayout$toLayout$, oldLayout, newLayout); } else { objc_willTransition(this, willTransitionFromLayout$toLayout$, oldLayout, newLayout); }
    }
    /*</methods>*/

}
