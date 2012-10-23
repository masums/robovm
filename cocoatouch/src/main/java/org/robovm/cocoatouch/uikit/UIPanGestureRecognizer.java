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
 *
 * <div class="javadoc">
 *   @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIPanGestureRecognizer_Class/Reference/Reference.html">UIPanGestureRecognizer Class Reference</a>
 *   @since Available in iOS 3.2 and later.
 * </div>
 */
/*<library>*/@Library("UIKit")/*</library>*/
public class /*<name>*/ UIPanGestureRecognizer /*</name>*/ 
    extends /*<extends>*/ UIGestureRecognizer /*</extends>*/ 
    /*<implements>*/ /*</implements>*/ {

    static {
        ObjCRuntime.bind(/*<name>*/ UIPanGestureRecognizer /*</name>*/.class);
    }

    private static final ObjCClass objCClass = ObjCClass.getByType(/*<name>*/ UIPanGestureRecognizer /*</name>*/.class);

    /*<constructors>*/
    protected UIPanGestureRecognizer(SkipInit skipInit) { super(skipInit); }
    public UIPanGestureRecognizer() {}
    
    /*</constructors>*/
    /*<properties>*/
    
    private static final Selector maximumNumberOfTouches = Selector.register("maximumNumberOfTouches");
    @Bridge(symbol = "objc_msgSend") private native static int objc_getMaximumNumberOfTouches(UIPanGestureRecognizer __self__, Selector __cmd__);
    @Bridge(symbol = "objc_msgSendSuper") private native static int objc_getMaximumNumberOfTouchesSuper(ObjCSuper __super__, UIPanGestureRecognizer __self__, Selector __cmd__);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIPanGestureRecognizer_Class/Reference/Reference.html#//apple_ref/occ/instp/UIPanGestureRecognizer/maximumNumberOfTouches">@property(nonatomic) NSUInteger maximumNumberOfTouches</a>
     * @since Available in iOS 3.2 and later.
     */
    public int getMaximumNumberOfTouches() {
        if (customClass) { return objc_getMaximumNumberOfTouchesSuper(getSuper(), this, maximumNumberOfTouches); } else { return objc_getMaximumNumberOfTouches(this, maximumNumberOfTouches); }
    }
    
    private static final Selector setMaximumNumberOfTouches$ = Selector.register("setMaximumNumberOfTouches:");
    @Bridge(symbol = "objc_msgSend") private native static void objc_setMaximumNumberOfTouches(UIPanGestureRecognizer __self__, Selector __cmd__, int maximumNumberOfTouches);
    @Bridge(symbol = "objc_msgSendSuper") private native static void objc_setMaximumNumberOfTouchesSuper(ObjCSuper __super__, UIPanGestureRecognizer __self__, Selector __cmd__, int maximumNumberOfTouches);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIPanGestureRecognizer_Class/Reference/Reference.html#//apple_ref/occ/instp/UIPanGestureRecognizer/maximumNumberOfTouches">@property(nonatomic) NSUInteger maximumNumberOfTouches</a>
     * @since Available in iOS 3.2 and later.
     */
    public void setMaximumNumberOfTouches(int maximumNumberOfTouches) {
        if (customClass) { objc_setMaximumNumberOfTouchesSuper(getSuper(), this, setMaximumNumberOfTouches$, maximumNumberOfTouches); } else { objc_setMaximumNumberOfTouches(this, setMaximumNumberOfTouches$, maximumNumberOfTouches); }
    }
    
    private static final Selector minimumNumberOfTouches = Selector.register("minimumNumberOfTouches");
    @Bridge(symbol = "objc_msgSend") private native static int objc_getMinimumNumberOfTouches(UIPanGestureRecognizer __self__, Selector __cmd__);
    @Bridge(symbol = "objc_msgSendSuper") private native static int objc_getMinimumNumberOfTouchesSuper(ObjCSuper __super__, UIPanGestureRecognizer __self__, Selector __cmd__);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIPanGestureRecognizer_Class/Reference/Reference.html#//apple_ref/occ/instp/UIPanGestureRecognizer/minimumNumberOfTouches">@property(nonatomic) NSUInteger minimumNumberOfTouches</a>
     * @since Available in iOS 3.2 and later.
     */
    public int getMinimumNumberOfTouches() {
        if (customClass) { return objc_getMinimumNumberOfTouchesSuper(getSuper(), this, minimumNumberOfTouches); } else { return objc_getMinimumNumberOfTouches(this, minimumNumberOfTouches); }
    }
    
    private static final Selector setMinimumNumberOfTouches$ = Selector.register("setMinimumNumberOfTouches:");
    @Bridge(symbol = "objc_msgSend") private native static void objc_setMinimumNumberOfTouches(UIPanGestureRecognizer __self__, Selector __cmd__, int minimumNumberOfTouches);
    @Bridge(symbol = "objc_msgSendSuper") private native static void objc_setMinimumNumberOfTouchesSuper(ObjCSuper __super__, UIPanGestureRecognizer __self__, Selector __cmd__, int minimumNumberOfTouches);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIPanGestureRecognizer_Class/Reference/Reference.html#//apple_ref/occ/instp/UIPanGestureRecognizer/minimumNumberOfTouches">@property(nonatomic) NSUInteger minimumNumberOfTouches</a>
     * @since Available in iOS 3.2 and later.
     */
    public void setMinimumNumberOfTouches(int minimumNumberOfTouches) {
        if (customClass) { objc_setMinimumNumberOfTouchesSuper(getSuper(), this, setMinimumNumberOfTouches$, minimumNumberOfTouches); } else { objc_setMinimumNumberOfTouches(this, setMinimumNumberOfTouches$, minimumNumberOfTouches); }
    }
    /*</properties>*/
    /*<methods>*/
    
    private static final Selector translationInView$ = Selector.register("translationInView:");
    @Bridge(symbol = "objc_msgSend") private native static CGPoint objc_getTranslation(UIPanGestureRecognizer __self__, Selector __cmd__, UIView view);
    @Bridge(symbol = "objc_msgSendSuper") private native static CGPoint objc_getTranslationSuper(ObjCSuper __super__, UIPanGestureRecognizer __self__, Selector __cmd__, UIView view);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIPanGestureRecognizer_Class/Reference/Reference.html#//apple_ref/occ/instm/UIPanGestureRecognizer/translationInView:">- (CGPoint)translationInView:(UIView *)view</a>
     * @since Available in iOS 3.2 and later.
     */
    public CGPoint getTranslation(UIView view) {
        if (customClass) { return objc_getTranslationSuper(getSuper(), this, translationInView$, view); } else { return objc_getTranslation(this, translationInView$, view); }
    }
    
    private static final Selector velocityInView$ = Selector.register("velocityInView:");
    @Bridge(symbol = "objc_msgSend") private native static CGPoint objc_getVelocity(UIPanGestureRecognizer __self__, Selector __cmd__, UIView view);
    @Bridge(symbol = "objc_msgSendSuper") private native static CGPoint objc_getVelocitySuper(ObjCSuper __super__, UIPanGestureRecognizer __self__, Selector __cmd__, UIView view);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIPanGestureRecognizer_Class/Reference/Reference.html#//apple_ref/occ/instm/UIPanGestureRecognizer/velocityInView:">- (CGPoint)velocityInView:(UIView *)view</a>
     * @since Available in iOS 3.2 and later.
     */
    public CGPoint getVelocity(UIView view) {
        if (customClass) { return objc_getVelocitySuper(getSuper(), this, velocityInView$, view); } else { return objc_getVelocity(this, velocityInView$, view); }
    }
    
    private static final Selector setTranslation$inView$ = Selector.register("setTranslation:inView:");
    @Bridge(symbol = "objc_msgSend") private native static void objc_setTranslation(UIPanGestureRecognizer __self__, Selector __cmd__, CGPoint translation, UIView view);
    @Bridge(symbol = "objc_msgSendSuper") private native static void objc_setTranslationSuper(ObjCSuper __super__, UIPanGestureRecognizer __self__, Selector __cmd__, CGPoint translation, UIView view);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIPanGestureRecognizer_Class/Reference/Reference.html#//apple_ref/occ/instm/UIPanGestureRecognizer/setTranslation:inView:">- (void)setTranslation:(CGPoint)translation inView:(UIView *)view</a>
     * @since Available in iOS 3.2 and later.
     */
    public void setTranslation(CGPoint translation, UIView view) {
        if (customClass) { objc_setTranslationSuper(getSuper(), this, setTranslation$inView$, translation, view); } else { objc_setTranslation(this, setTranslation$inView$, translation, view); }
    }
    /*</methods>*/

}
