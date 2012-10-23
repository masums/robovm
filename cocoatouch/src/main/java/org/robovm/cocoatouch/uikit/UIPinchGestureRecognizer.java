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
 *   @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIPinchGestureRecognizer_Class/Reference/Reference.html">UIPinchGestureRecognizer Class Reference</a>
 *   @since Available in iOS 3.2 and later.
 * </div>
 */
/*<library>*/@Library("UIKit")/*</library>*/
public class /*<name>*/ UIPinchGestureRecognizer /*</name>*/ 
    extends /*<extends>*/ UIGestureRecognizer /*</extends>*/ 
    /*<implements>*/ /*</implements>*/ {

    static {
        ObjCRuntime.bind(/*<name>*/ UIPinchGestureRecognizer /*</name>*/.class);
    }

    private static final ObjCClass objCClass = ObjCClass.getByType(/*<name>*/ UIPinchGestureRecognizer /*</name>*/.class);

    /*<constructors>*/
    protected UIPinchGestureRecognizer(SkipInit skipInit) { super(skipInit); }
    public UIPinchGestureRecognizer() {}
    
    /*</constructors>*/
    /*<properties>*/
    
    private static final Selector scale = Selector.register("scale");
    @Bridge(symbol = "objc_msgSend") private native static float objc_getScale(UIPinchGestureRecognizer __self__, Selector __cmd__);
    @Bridge(symbol = "objc_msgSendSuper") private native static float objc_getScaleSuper(ObjCSuper __super__, UIPinchGestureRecognizer __self__, Selector __cmd__);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIPinchGestureRecognizer_Class/Reference/Reference.html#//apple_ref/occ/instp/UIPinchGestureRecognizer/scale">@property(nonatomic) CGFloat scale</a>
     * @since Available in iOS 3.2 and later.
     */
    public float getScale() {
        if (customClass) { return objc_getScaleSuper(getSuper(), this, scale); } else { return objc_getScale(this, scale); }
    }
    
    private static final Selector setScale$ = Selector.register("setScale:");
    @Bridge(symbol = "objc_msgSend") private native static void objc_setScale(UIPinchGestureRecognizer __self__, Selector __cmd__, float scale);
    @Bridge(symbol = "objc_msgSendSuper") private native static void objc_setScaleSuper(ObjCSuper __super__, UIPinchGestureRecognizer __self__, Selector __cmd__, float scale);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIPinchGestureRecognizer_Class/Reference/Reference.html#//apple_ref/occ/instp/UIPinchGestureRecognizer/scale">@property(nonatomic) CGFloat scale</a>
     * @since Available in iOS 3.2 and later.
     */
    public void setScale(float scale) {
        if (customClass) { objc_setScaleSuper(getSuper(), this, setScale$, scale); } else { objc_setScale(this, setScale$, scale); }
    }
    
    private static final Selector velocity = Selector.register("velocity");
    @Bridge(symbol = "objc_msgSend") private native static float objc_getVelocity(UIPinchGestureRecognizer __self__, Selector __cmd__);
    @Bridge(symbol = "objc_msgSendSuper") private native static float objc_getVelocitySuper(ObjCSuper __super__, UIPinchGestureRecognizer __self__, Selector __cmd__);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIPinchGestureRecognizer_Class/Reference/Reference.html#//apple_ref/occ/instp/UIPinchGestureRecognizer/velocity">@property(nonatomic, readonly) CGFloat velocity</a>
     * @since Available in iOS 3.2 and later.
     */
    public float getVelocity() {
        if (customClass) { return objc_getVelocitySuper(getSuper(), this, velocity); } else { return objc_getVelocity(this, velocity); }
    }
    /*</properties>*/
    /*<methods>*/
    
    /*</methods>*/

}
