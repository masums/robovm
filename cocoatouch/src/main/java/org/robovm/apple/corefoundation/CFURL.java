/*
 * Copyright (C) 2014 Trillian Mobile AB
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
package org.robovm.apple.corefoundation;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.dispatch.*;
import org.robovm.apple.foundation.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("CoreFoundation")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CFURL/*</name>*/ 
    extends /*<extends>*/CFType/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CFURLPtr extends Ptr<CFURL, CFURLPtr> {}/*</ptr>*/
    /*<bind>*/static { Bro.bind(CFURL.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CFURL() {}
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Bridge(symbol="CFURLGetTypeID", optional=true)
    public static native @MachineSizedUInt long getClassTypeID();
    @Bridge(symbol="CFURLCreateWithBytes", optional=true)
    private static native CFURL create(CFAllocator allocator, BytePtr URLBytes, @MachineSizedSInt long length, CFStringEncodings encoding, CFURL baseURL);
    @Bridge(symbol="CFURLCreateData", optional=true)
    public static native CFData asData(CFAllocator allocator, CFURL url, CFStringEncodings encoding, boolean escapeWhitespace);
    @Bridge(symbol="CFURLCreateWithString", optional=true)
    public static native CFURL create(CFAllocator allocator, String URLString, CFURL baseURL);
    @Bridge(symbol="CFURLCreateAbsoluteURLWithBytes", optional=true)
    private static native CFURL create(CFAllocator alloc, BytePtr relativeURLBytes, @MachineSizedSInt long length, CFStringEncodings encoding, CFURL baseURL, boolean useCompatibilityMode);
    @Bridge(symbol="CFURLCreateWithFileSystemPath", optional=true)
    public static native CFURL createWithFileSystemPath(CFAllocator allocator, String filePath, CFURLPathStyle pathStyle, boolean isDirectory);
    @Bridge(symbol="CFURLCreateFromFileSystemRepresentation", optional=true)
    public static native CFURL createFromFileSystemRepresentation(CFAllocator allocator, BytePtr buffer, @MachineSizedSInt long bufLen, boolean isDirectory);
    @Bridge(symbol="CFURLCreateWithFileSystemPathRelativeToBase", optional=true)
    public static native CFURL createWithFileSystemPathRelativeToBase(CFAllocator allocator, String filePath, CFURLPathStyle pathStyle, boolean isDirectory, CFURL baseURL);
    @Bridge(symbol="CFURLCreateFromFileSystemRepresentationRelativeToBase", optional=true)
    public static native CFURL createFromFileSystemRepresentationRelativeToBase(CFAllocator allocator, BytePtr buffer, @MachineSizedSInt long bufLen, boolean isDirectory, CFURL baseURL);
    @Bridge(symbol="CFURLCopyAbsoluteURL", optional=true)
    public native CFURL getAbsoluteURL();
    @Bridge(symbol="CFURLGetString", optional=true)
    public native String getString();
    @Bridge(symbol="CFURLGetBaseURL", optional=true)
    public native CFURL getBaseURL();
    @Bridge(symbol="CFURLCanBeDecomposed", optional=true)
    public native boolean canBeDecomposed();
    @Bridge(symbol="CFURLCopyScheme", optional=true)
    public native String getScheme();
    @Bridge(symbol="CFURLCopyNetLocation", optional=true)
    public native String getNetLocation();
    @Bridge(symbol="CFURLCopyPath", optional=true)
    public native String getPath();
    @Bridge(symbol="CFURLCopyStrictPath", optional=true)
    public native String getStrictPath(BooleanPtr isAbsolute);
    @Bridge(symbol="CFURLCopyFileSystemPath", optional=true)
    public native String getFileSystemPath(CFURLPathStyle pathStyle);
    @Bridge(symbol="CFURLHasDirectoryPath", optional=true)
    public native boolean hasDirectoryPath();
    @Bridge(symbol="CFURLCopyResourceSpecifier", optional=true)
    public native String getResourceSpecifier();
    @Bridge(symbol="CFURLCopyHostName", optional=true)
    public native String getHostName();
    @Bridge(symbol="CFURLGetPortNumber", optional=true)
    public native int getPortNumber();
    @Bridge(symbol="CFURLCopyUserName", optional=true)
    public native String getUserName();
    @Bridge(symbol="CFURLCopyPassword", optional=true)
    public native String getPassword();
    @Bridge(symbol="CFURLCopyParameterString", optional=true)
    public native String getParameterString(String charactersToLeaveEscaped);
    @Bridge(symbol="CFURLCopyQueryString", optional=true)
    public native String getQueryString(String charactersToLeaveEscaped);
    @Bridge(symbol="CFURLCopyFragment", optional=true)
    public native String getFragment(String charactersToLeaveEscaped);
    @Bridge(symbol="CFURLCopyLastPathComponent", optional=true)
    public native String getLastPathComponent();
    @Bridge(symbol="CFURLCopyPathExtension", optional=true)
    public native String getPathExtension();
    @Bridge(symbol="CFURLCreateCopyAppendingPathComponent", optional=true)
    public static native CFURL createCopyByAppendingPathComponent(CFAllocator allocator, CFURL url, String pathComponent, boolean isDirectory);
    @Bridge(symbol="CFURLCreateCopyDeletingLastPathComponent", optional=true)
    public static native CFURL createCopyByDeletingLastPathComponent(CFAllocator allocator, CFURL url);
    @Bridge(symbol="CFURLCreateCopyAppendingPathExtension", optional=true)
    public static native CFURL createCopyByAppendingPathExtension(CFAllocator allocator, CFURL url, String extension);
    @Bridge(symbol="CFURLCreateCopyDeletingPathExtension", optional=true)
    public static native CFURL createCopyByDeletingPathExtension(CFAllocator allocator, CFURL url);
    @Bridge(symbol="CFURLCreateStringByReplacingPercentEscapes", optional=true)
    public static native String create(CFAllocator allocator, String originalString, String charactersToLeaveEscaped);
    @Bridge(symbol="CFURLCreateStringByReplacingPercentEscapesUsingEncoding", optional=true)
    public static native String create(CFAllocator allocator, String origString, String charsToLeaveEscaped, CFStringEncodings encoding);
    @Bridge(symbol="CFURLCreateStringByAddingPercentEscapes", optional=true)
    public static native String encodeURLString(CFAllocator allocator, String originalString, String charactersToLeaveUnescaped, String legalURLCharactersToBeEscaped, CFStringEncodings encoding);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Bridge(symbol="CFURLIsFileReferenceURL", optional=true)
    public native boolean isFileReferenceURL();
    /**
     * @since Available in iOS 4.0 and later.
     */
    public static CFURL createFileReferenceURL(CFAllocator allocator, CFURL url) throws CFErrorException {
       CFError.CFErrorPtr ptr = new CFError.CFErrorPtr();
       CFURL result = createFileReferenceURL(allocator, url, ptr);
       if (ptr.get() != null) { throw new CFErrorException(ptr.get()); }
       return result;
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Bridge(symbol="CFURLCreateFileReferenceURL", optional=true)
    private static native CFURL createFileReferenceURL(CFAllocator allocator, CFURL url, CFError.CFErrorPtr error);
    /**
     * @since Available in iOS 4.0 and later.
     */
    public static CFURL createFilePathURL(CFAllocator allocator, CFURL url) throws CFErrorException {
       CFError.CFErrorPtr ptr = new CFError.CFErrorPtr();
       CFURL result = createFilePathURL(allocator, url, ptr);
       if (ptr.get() != null) { throw new CFErrorException(ptr.get()); }
       return result;
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Bridge(symbol="CFURLCreateFilePathURL", optional=true)
    private static native CFURL createFilePathURL(CFAllocator allocator, CFURL url, CFError.CFErrorPtr error);
    /**
     * @since Available in iOS 4.0 and later.
     */
    public boolean getResourceValue(String key, VoidPtr propertyValueTypeRefPtr) throws CFErrorException {
       CFError.CFErrorPtr ptr = new CFError.CFErrorPtr();
       boolean result = getResourceValue(key, propertyValueTypeRefPtr, ptr);
       if (ptr.get() != null) { throw new CFErrorException(ptr.get()); }
       return result;
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Bridge(symbol="CFURLCopyResourcePropertyForKey", optional=true)
    private native boolean getResourceValue(String key, VoidPtr propertyValueTypeRefPtr, CFError.CFErrorPtr error);
    /**
     * @since Available in iOS 4.0 and later.
     */
    public CFDictionary getResourceValues(CFArray keys) throws CFErrorException {
       CFError.CFErrorPtr ptr = new CFError.CFErrorPtr();
       CFDictionary result = getResourceValues(keys, ptr);
       if (ptr.get() != null) { throw new CFErrorException(ptr.get()); }
       return result;
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Bridge(symbol="CFURLCopyResourcePropertiesForKeys", optional=true)
    private native CFDictionary getResourceValues(CFArray keys, CFError.CFErrorPtr error);
    /**
     * @since Available in iOS 4.0 and later.
     */
    public boolean setResourceValue(String key, CFType propertyValue) throws CFErrorException {
       CFError.CFErrorPtr ptr = new CFError.CFErrorPtr();
       boolean result = setResourceValue(key, propertyValue, ptr);
       if (ptr.get() != null) { throw new CFErrorException(ptr.get()); }
       return result;
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Bridge(symbol="CFURLSetResourcePropertyForKey", optional=true)
    private native boolean setResourceValue(String key, CFType propertyValue, CFError.CFErrorPtr error);
    /**
     * @since Available in iOS 4.0 and later.
     */
    public boolean setResourceValues(CFDictionary keyedPropertyValues) throws CFErrorException {
       CFError.CFErrorPtr ptr = new CFError.CFErrorPtr();
       boolean result = setResourceValues(keyedPropertyValues, ptr);
       if (ptr.get() != null) { throw new CFErrorException(ptr.get()); }
       return result;
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Bridge(symbol="CFURLSetResourcePropertiesForKeys", optional=true)
    private native boolean setResourceValues(CFDictionary keyedPropertyValues, CFError.CFErrorPtr error);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Bridge(symbol="CFURLClearResourcePropertyCacheForKey", optional=true)
    public native void clearResourcePropertyCacheForKey(String key);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Bridge(symbol="CFURLClearResourcePropertyCache", optional=true)
    public native void clearResourcePropertyCache();
    /**
     * @since Available in iOS 4.0 and later.
     */
    public boolean isResourceReachable() throws CFErrorException {
       CFError.CFErrorPtr ptr = new CFError.CFErrorPtr();
       boolean result = isResourceReachable(ptr);
       if (ptr.get() != null) { throw new CFErrorException(ptr.get()); }
       return result;
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Bridge(symbol="CFURLResourceIsReachable", optional=true)
    private native boolean isResourceReachable(CFError.CFErrorPtr error);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Bridge(symbol="CFURLStartAccessingSecurityScopedResource", optional=true)
    public native boolean startAccessingSecurityScopedResource();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Bridge(symbol="CFURLStopAccessingSecurityScopedResource", optional=true)
    public native void stopAccessingSecurityScopedResource();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Bridge(symbol="CFCopyHomeDirectoryURL", optional=true)
    public static native CFURL getHomeDirectoryURL();
    /*</methods>*/
}
